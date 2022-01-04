package com.array.exam;

public class ArrayMinMax {
	public static int getMaxValue(int[] array) {
		int max = array[0];
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		return max;
	}	
	public static int getMinValue(int[] array) {
		int min = array[0];
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		return min;
	}	
	public static void main(String[] args) {
		int[] input = {10,25,9,5,89,64};
		int arrayInMin = getMinValue(input);
		System.out.println("Array in Min Value is ------ "+arrayInMin);
		int arrayInMax = getMaxValue(input);
		System.out.println("Array in Max Value is ------ "+arrayInMax);
	}		
}
