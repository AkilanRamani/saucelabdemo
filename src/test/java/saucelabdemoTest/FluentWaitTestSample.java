package saucelabdemoTest;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FluentWaitTestSample {
	
	public static void main(String[] args) {
		 try {
			 
			 //Reading a File from the File 
	            FileReader fr = new FileReader("C:\\AKILAN\\abc.txt");
	 //This is for Writing a data on to the Corresponding File.
	            FileWriter fw = new FileWriter("C:\\AKILAN\\xyz.txt");
	 
	            String str = "";
	 
	            int i;
	            
	            // in case if it returns (-1) , then no data is Present in the File it means.
	            while ((i = fr.read()) != -1) {
	            	
	            	//str = str + (char)i; //  String str =  "" +w ; // w + e (we).
	                str += (char)i; // It is used to return a character in ASCII form. It returns -1 at the end of file.
	            }
	 
	            System.out.println(str);
	 
	            fw.write(str);
	 
	            fr.close();
	            fw.close();
	 
	           
	            System.out.println(
	                "File reading and writing both done");
	        }
	        catch (IOException e) {

	            System.out.println(
	                "There are some IOException");
	        }
	    }
	
	   
	}


