/**
 * Main.java
 */
package com.alset333.Java.Java_NKS_Rewrite_Meta;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.alset333.Java.Java_NKS_Rewrite_Meta.exceptions.InvalidChunkException;

/**
 * @author Peter Maar
 * @version 0.1.0
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Path path = Paths.get("BA Analog Pluck [SN].nksf");
		byte[] contents;
		try {
			contents = Files.readAllBytes(path);

			int counter = 1;
			for(byte b : contents) {
				
				System.out.print((char)b + " ");
				if (counter % 16 == 0) System.out.println();
				counter++;
			}
			
			System.out.println();
			
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		char[] ID = {'T', 'E', 'S', 'T'};
		int length = 2;
		byte[] data = {'H', 'I'};
		boolean padding = false;
		
		
		Chunk c;
		try {
			c = new Chunk(ID, length, data, padding);

			c.printAll();
		} catch (InvalidChunkException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
