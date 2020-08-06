package com.company.algorithms;

public class Searching {

	public static void main(String[] args) {
		int[] check = {54,34,65,32,67,456,2,5,456,456,78};
		
		int lookFor = 54;
		int index = -1; // make sure we are aware that if the number does not exist in
							// in the array, then it returns a number that cannot 
							// possibly be an index of the array.
		
		for(int i = 0; i<check.length; i++) { // O(n) [big O of n]
			if(check[i] == lookFor) {
				index=i;
				break; // omega(1) [Omega of 1]
			}
		}
		System.out.println(index);
		
	}
}
