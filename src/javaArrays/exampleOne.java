package javaArrays;

import java.util.Arrays;

public class exampleOne {

	public static void main(String[] args) {


		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(numbers[7] + "\n");
	
		
		//
		String[] cars = { "Lexus", "Jaguar", "Mitsubishi", "Volvo", };
		System.out.println(Arrays.toString(cars));
		System.out.println(" "+cars[0]+ "\n");

		for (int i=0;i<cars.length;i++) {
			System.out.println("value at index of:"+i+" = "+cars[i]);
		}
		
		System.out.println();
		
		cars[3]= "honda";
		for (int i=0;i<cars.length;i++) {
			System.out.println("value at index of:"+i+" = "+cars[i]);
		}
		
		System.out.println();
		
		for (int i=0;i<cars.length;i++) {
			System.out.println("value at index of:"+i+" = "+cars[i].toUpperCase());
		}
		
		
	}

}
