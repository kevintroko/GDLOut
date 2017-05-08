using System.Collections.Generic;
using UnityEngine;
using System.Collections;

public class PFTest : MonoBehaviour {

	public Nodo start;
	public Nodo end;

	public float speed;
	public float threshold;

	private List<Nodo> path;
	private int currentNode;

	// Use this for initialization
	void Start () {

	}

	// Update is called once per frame
	void Update () {

		if (Input.GetKeyUp (KeyCode.B)) {

			List<Nodo> result = PathFinding.Breadthwise (start, end);

			for (int i = 0; i < result.Count; i++) {

				print (result [i].transform.name);
			}

			path = result;
			currentNode = 0;
		}

		if (Input.GetKeyUp (KeyCode.D)) {

			List<Nodo> result = PathFinding.Depthwise (start, end);

			for (int i = 0; i < result.Count; i++) {

				print (result [i].transform.name);
			}

			path = result;
			currentNode = 0;

		}

		if (Input.GetKeyUp (KeyCode.A)) {

			List<Nodo> result = PathFinding.AStar (start, end);

			for (int i = 0; i < result.Count; i++) {

				print (result [i].transform.name);
			}

			path = result;
			currentNode = 0;

		}

		//picking - click on an object in game
		//raycasting
		if(Input.GetMouseButtonUp(0)){
			Ray ray = Camera.main.ScreenPointToRay (Input.mousePosition);
			RaycastHit hit;
			if(Physics.Raycast(ray, out hit)){

				print (hit.collider.transform.name);
				print (hit.point);

			}
		}

		if(path != null && currentNode != path.Count){

			transform.LookAt (path[currentNode].transform);
			transform.Translate (transform.forward * Time.deltaTime * speed, Space.World);

			float distance = Vector3.Distance (transform.position, path [currentNode].transform.position);
			if(distance < threshold){
				currentNode++;
			}
		}

	}
}
