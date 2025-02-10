package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class javaFR {

	public static void main(String[] args) {
		
		String linea;
		
		try {
			File file= new File("C:\\Users\\rich\\Desktop\\ceteq\\testFR.txt");
			
			FileReader Fr = new FileReader(file);
			BufferedReader buffer= new BufferedReader(Fr);			
			
			while((linea= buffer.readLine())!=null){
				System.out.println(linea);
				
			}

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub

	}

}
