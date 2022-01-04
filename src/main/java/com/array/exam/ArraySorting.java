package com.array.exam;

public class ArraySorting {

	public static void main(String[] args) {

		int[] inputArray = {25,86,9,19,95};		
		int[] outputArray = sortingInc(inputArray);
		System.out.println("---- Increasing Order ----");
		for (int i = 0; i < outputArray.length; i++) {
			System.out.print(outputArray[i]+",");
		}
		System.out.println("\n---- Decreasing Order ----");
		int[] outputDec = sortingDec(inputArray);
		for (int i = 0; i < outputDec.length; i++) {
			System.out.print(outputDec[i]+",");
		}	
	}
	private static int[] sortingDec(int[] inputDec) {
		int temp;
		int[] result = null;
		result = new int[inputDec.length];
		for(int i=0;i<inputDec.length;i++) {
			for(int j=i+1;j<inputDec.length;j++) {
				if(inputDec[i]<inputDec[j]) {
					temp=inputDec[i];
					inputDec[i]=inputDec[j];
					inputDec[j]=temp;
				}
			}
		}
		return inputDec;
	}

	private static int[] sortingInc(int[] inputArray) {
		int temp;
		int[] result = null;
		result = new int[inputArray.length];		
		for(int i=0; i<inputArray.length;i++) {
			for(int j=i+1; j<inputArray.length;j++) {
				if(inputArray[i]>inputArray[j]) {
					temp = inputArray[i];
					inputArray[i]=inputArray[j];
					inputArray[j]=temp;
				}
			}
		}
		return inputArray;
	}
	
}
