package gdloutapp;

 // Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.
import java.io.*;
import java.util.*;
 
// This class represents a directed graph using adjacency list
// representation
class Graph<T>

{
	File f = new File("output.txt");
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists
 
    // Constructor
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
    
    
 
    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
 
    // prints BFS traversal from a given source s
    void BFS(int s)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];
 
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);
        
 
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            //System.out.print(s+" ");
            String str = String.valueOf(s);
            this.toTextFile(str);
            
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        this.toTextFile("\r\n");
    }
 
    public void toTextFile(String text){
    	

    	//Escritura
    	try{
    	FileWriter w = new FileWriter(f, true);
    	BufferedWriter bw = new BufferedWriter(w);
    	PrintWriter wr = new PrintWriter(bw);	
    	
    	wr.append(text + " "); //concatenamos en el archivo sin borrar lo existente
    	              //ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedara guardado con informacion escrita
    	              //de no hacerlo no se escribira nada en el archivo
    	wr.close();
    	bw.close();
    	}catch(IOException e){};
    	       }
    // Driver method to
    public static void main(String args[])
    {	
    	//crear grafo
        Graph g = new Graph(164);
    	//define initial nodes
    	int city = 0;
    	int price = 6;
    	int category = 9;
    	
    	//add nodes and connect them
    	File database = new File("database.txt");
        System.out.println("databasereaded");
    	try {
			Scanner a= new Scanner(database);
			while (a.hasNext()){
				int place = a.nextInt();
				int counter = 0;
				for (int i=0; i<3;i++){
					g.addEdge(a.nextInt(), place);
					counter++;
					//System.out.println(counter);
				}
			}
			a.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

    	//BFS
    	g.BFS(0);
    	g.BFS(6);
    	g.BFS(9);
    	
    	//getresults
    	FrequencyTable ft = new FrequencyTable();
        ft.getResults(); 
        
        //save places in list
        File placesid = new File("placesid.txt");
        File placesname = new File("placesname.txt");
        LinkedList list = new LinkedList(); 
        
    	try {
			Scanner a= new Scanner(placesid);
			Scanner b = new Scanner(placesname);
			while (b.hasNextLine()){
				//System.out.println(b.nextLine());
				Lugar actualplace = new Lugar(b.nextLine(), category, price, city);	
				list.add(actualplace);
			}
			a.close();
		//	System.out.println(list.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
    	
    	//read results from list
    	File results2 = new File("results.txt");
    	try{
    		Scanner rstr = new Scanner(results2);
    		while(rstr.hasNextInt()){
    			//System.out.println(rstr.nextInt()-3);
    			
    			System.out.println(list.get(rstr.nextInt()-14));
    		}
    	}catch(FileNotFoundException e) {
			e.printStackTrace();
		} 
    	
    	
      
        /* 
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 5);
        g.addEdge(6, 3);
        g.addEdge(6, 4);
        g.addEdge(6, 2);
        g.addEdge(7, 2);
       // g.addEdge(7,4);
        g.addEdge(7, 3);

        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(1);
        g.BFS(6);
        g.BFS(7);
        
        FrequencyTable ft = new FrequencyTable();
        ft.getResults(); */
    }	
}
