import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FrequencyTable {
    private ST<String, Integer> st = new ST<String, Integer>();

    public void increment(String key) {
        int count = frequencyOf(key);
        st.put(key, count + 1);
    }

    // return the number of times the key appears
    public int frequencyOf(String key) {
        if (!st.contains(key)) return 0;
        else return st.get(key);
    }

    public ArrayList returnThree(){
    	ArrayList results = new ArrayList();
    		for(int j=0; j<99; j++){
    			if(st.contains(String.valueOf(j))){
    				if(this.frequencyOf(String.valueOf(j))==3){
    					results.add(j);
    				}
    			}
    		}
    	return results;
    }
    // returns a string representation of this frequency table
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String key : st.keys()) {
            sb.append(frequencyOf(key) + " " + key + "\n");
        }
        return sb.toString();
    }
    
    public static void main(String args[]){
    	FrequencyTable a = new FrequencyTable();
    	a.increment(String.valueOf(1));
    	a.increment(String.valueOf(3));
    	a.increment(String.valueOf(4));
    	a.increment(String.valueOf(2));
    	a.increment(String.valueOf(5));
    	a.increment(String.valueOf(6));
    	a.increment(String.valueOf(3));
    	a.increment(String.valueOf(4));
    	a.increment(String.valueOf(2));
    	a.increment(String.valueOf(7));
    	a.increment(String.valueOf(2));
    	a.increment(String.valueOf(4));
    	ArrayList b = a.returnThree();
    	File f = new File("results.txt");
    	try{
        	FileWriter w = new FileWriter(f, true);
        	BufferedWriter bw = new BufferedWriter(w);
        	PrintWriter wr = new PrintWriter(bw);	
        	for(int i=0; i<b.size(); i++)
        	wr.append(b.get(i) + " "); //concatenamos en el archivo sin borrar lo existente
        	              //ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedará guardado con información escrita
        	              //de no hacerlo no se escribirá nada en el archivo
        	wr.close();
        	bw.close();
        	}catch(IOException e){};
    }
}