using UnityEngine;
using System.Collections.Generic;

public class PathFinding{

	public static List<Nodo> Depthwise(Nodo start, Nodo end){

		Stack<Nodo> work = new Stack<Nodo> ();
		List<Nodo> visited = new List<Nodo> ();

		start.history = new List<Nodo>();

		work.Push (start);
		visited.Add (start);

		while (work.Count > 0) {

			Nodo current = work.Pop ();
			if (current == end) {
				List<Nodo> result = current.history;
				result.Add (current);
				return result;

			} else {
				for(int i = 0; i < current.neighbors.Length; i++){
					Nodo currentChild = current.neighbors [i];
					if (!visited.Contains (currentChild)) {

						work.Push (currentChild);
						visited.Add (currentChild);
						currentChild.history = new List<Nodo> (current.history);
						currentChild.history.Add (current);

					}
				}

			}
		}

		return null;
	}

	public static List<Nodo> Breadthwise(Nodo start, Nodo end){

		Queue<Nodo> work = new Queue<Nodo>();
		List<Nodo> visited = new List<Nodo>();

		work.Enqueue (start);
		visited.Add(start);
		start.history = new List<Nodo> ();

		while (work.Count > 0) {

			Nodo current = work.Dequeue ();

			if(current == end){

				List<Nodo> result = current.history;
				result.Add (current);
				return result;

				// we found the solution!

			} else {

				for (int i = 0; i < current.neighbors.Length; i++) {

					Nodo currentChild = current.neighbors[i];
					if(!visited.Contains(currentChild)){

						work.Enqueue (currentChild);
						visited.Add (currentChild);
						currentChild.history = new List<Nodo> (current.history);
						currentChild.history.Add (current);
					}

				}
			}
		}

		// No available path
		return null;

	}

	public static List<Nodo> AStar(Nodo start, Nodo end){

		List<Nodo> visited = new List<Nodo> ();
		List <Nodo> work = new List <Nodo> ();

		start.history = new List<Nodo> ();
		start.g = 0;
		start.h = Vector3.Distance (start.transform.position, end.transform.position);

		visited.Add (start);
		work.Add (start);

		while (work.Count > 0) {

			//get the current one
			Nodo current = work[0];

			for(int i = 1; i < work.Count; i++){

				//check if answer is here
				if(work[i] == end){
					//return path

					List<Nodo> result = work [i].history;
					result.Add (work[i]);
					return result;
				}

				if (work [i].F < current.F) {

					current = work [i];
				}
			}

			work.Remove (current);

			//traverse children 
			for(int i = 0; i < current.neighbors.Length; i++){

				Nodo currentChild = current.neighbors [i];
				if (!visited.Contains (currentChild)) {

					visited.Add (currentChild);

					currentChild.history = new List<Nodo> (current.history);
					currentChild.history.Add (current);

					//g - certain
					currentChild.g = current.g + Vector3.Distance(current.transform.position, current.transform.position);

					//h - heuristic
					currentChild.h = Vector3.Distance(currentChild.transform.position, end.transform.position);

					work.Add (currentChild);
				}
			}
		}

		return null;
	}
}