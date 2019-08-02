/**
 * Chunk.java
 */
package com.alset333.Java.Java_NKS_Rewrite_Meta;

import com.alset333.Java.Java_NKS_Rewrite_Meta.exceptions.InvalidChunkException;

/**
 * @author Peter Maar
 * @version 0.1.0
 */
public class Chunk {

	char[] ID;
	int length;
	byte[] data;
	boolean padding;
	
	
	/**
	 * 
	 */
	public Chunk() {
		ID = new char[4];
		
	}
	
	public Chunk(char[] ID, int length, byte[] data, boolean padding) throws InvalidChunkException {
		if ( ID.length == 4 ) {
			this.ID = ID;
		} else {
			throw new InvalidChunkException("Invalid ID: " + String.valueOf(ID));
		}
		
		this.length = length;
		
		if ( data.length == length) {
			this.data = data;
		} else {
			throw new InvalidChunkException("Data for " + String.valueOf(this.ID) + " did not match length.");
		}
		
		this.padding = padding;
	}
	
	
	public void printAll() {
		System.out.print("ID: ");
		System.out.println(ID);
		
		System.out.print("Length: ");
		System.out.println(length);
		
		System.out.print("Data: ");
		for(int i = 0; i < data.length; i++) System.out.print(data[i] + ", ");
		System.out.print("\nData as Chars: ");
		for(int i = 0; i < data.length; i++) System.out.print((char)data[i] + ", ");
		System.out.println();
		
		System.out.print("Padding: ");
		System.out.println(padding);
	}

}
