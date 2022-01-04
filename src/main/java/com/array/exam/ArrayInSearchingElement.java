package com.array.exam;

public class ArrayInSearchingElement {

	public static void main(String[] args) {
		
		int[] array={12,85,36,5,95,8};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}
		int value=6;
		searchingElement(array,value);	
	}
	private static void searchingElement(int[]arr,int value) {
		boolean found=false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==value) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("\nYes element -- "+value+"--is There  ----");
		}
		else {
			System.out.println("\nNo element --- "+value+"--Not There ----");
		}
		//System.out.println("\nIs "+value+" present in Array "+found);
	}
}
