package org.tnsif.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		//compile-time
		int arr[] = {12,6,90,67};
		/* if we access 4th index,we will 
		 * egt an exception as "ArrayIndexOutOfBoundException",
		 * as that is not present in the array.
		 * System.out.println(arr[4]);
		 */
		System.out.println("Array of 2nd index is:"+arr[2]);
		
		//for printing all the elements in the array
		for(int i:arr) 
		{
		System.out.println(i+" ");
		}
	}

}
