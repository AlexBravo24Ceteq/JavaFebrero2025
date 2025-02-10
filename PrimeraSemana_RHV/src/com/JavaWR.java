package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaWR {

	public static void main(String[] args) {
		
		String cadena="\nheloeoejoej";
		try {
			File file= new File("C:\\Users\\rich\\Desktop\\ceteq\\testFR.txt");
			
			FileWriter Wr = new FileWriter(file,true);
			Wr.write(cadena);
			Wr.close();
			
				
			

			
		} catch (Exception e) {
System.out.println("no se localiza el archivo");		}
	}
}

