using UnityEngine;
using System.Collections.Generic;

public class Nodo : MonoBehaviour {

	public Nodo[] neighbors;
	public List<Nodo> history;
	public float g, h;

	//property
	public float F{

		get{
			return g + h;
		}
	}


	void OnDrawGizmos(){

		Gizmos.color = Color.blue;
		for (int i = 0; i < neighbors.Length; i++) {
			Gizmos.DrawLine (transform.position, neighbors[i].transform.position);
		}

		Gizmos.color = Color.green;
		Gizmos.DrawSphere (transform.position, 1);

	}

	void OnDrawGizmosSelected(){
		Gizmos.color = Color.red;
		Gizmos.DrawSphere (transform.position, 1);
	}
}