package com.array.exam;

public class ArrayDeleteByValue {

	public static void main(String[] args) {
	
		int[] array = {95,8,16,74,5,35,16};
		int value = 10;
		
		deleteValue(array,value);
	}
	
	private static void deleteValue(int[] array, int value) {
	
		boolean found =false;
		int position=0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]==value) {
				found = true;
				position=i;
				break;
			}
		}
		if(found) {
			for(int i=position;i<array.length-1;i++) {
				array[i]=array[i+1];
				System.out.println("---"+array[i]);
			}
		}
		else {
			System.out.println("Value "+value+" is Not there ");
		}
		System.out.println("\nArray After Deletion of Value ");
		
		for (int i = 0; i < array.length-1; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
}
