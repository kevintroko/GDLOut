package gdloutapp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyTable {
    private ST<String, Integer> st = new ST<String, Integer>();

    public void increment(String key) {
        int count = frequencyOf(key);
        st.put(key, count + 1);
    }

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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String key : st.keys()) {
            sb.append(frequencyOf(key) + " " + key + "\n");
        }
        return sb.toString();
    }
    
    public void getResults(){
    	File outputbfs = new File("output.txt");
    	try {
			Scanner a= new Scanner(outputbfs);
			while (a.hasNext()){
				int i = a.nextInt();
				this.increment(String.valueOf(i));
			}
			a.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	ArrayList b = this.returnThree();
    	File resultstxt = new File("results.txt");
    	try{
        	FileWriter w = new FileWriter(resultstxt);
        	BufferedWriter bw = new BufferedWriter(w);
        	PrintWriter wr = new PrintWriter(bw);	
        	for(int i=0; i<b.size(); i++)
        	wr.append(b.get(i) + " ");         	              
        	wr.close();
        	bw.close();
        	//System.out.println("hello there");
        	}catch(IOException e){};
        	try{
        		outputbfs.delete();
        	}catch(Exception e){
        		e.printStackTrace();
        	}	
    }
    /*
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
        	FileWriter w = new FileWriter(f);
        	BufferedWriter bw = new BufferedWriter(w);
        	PrintWriter wr = new PrintWriter(bw);	
        	for(int i=0; i<b.size(); i++)
        	wr.append(b.get(i) + " "); //concatenamos en el archivo sin borrar lo existente
        	              //ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedara guardado con informacion escrita
        	              //de no hacerlo no se escribira nada en el archivo
        	wr.close();
        	bw.close();
        	}catch(IOException e){};
        	try{

        		File file = new File("output.txt");

        		file.delete();

        	}catch(Exception e){

        		e.printStackTrace();

        	}	
    }*/
}