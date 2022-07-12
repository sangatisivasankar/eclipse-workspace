package com.sapient.sfcc.ui;
import java.util.Arrays;

public class Program2 {
	int maxDist(int arr[],int arrSize) {
		int maxDist = arr[1] - arr[0];
		int i,j;
		for(i=0;i<arrSize;i++) {
			for(j=i+1;j<arrSize;j++) {
				if(arr[j] - arr[i]>maxDist)
					maxDist = arr[j] - arr[i];
			}
				
		}
		return maxDist;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 maxdis= new Program2();
		int arr[]= {4,8,6,1,9,4};
		int getIndex =Arrays.asList(arr).indexOf(4);
	//  	System.out.println("8 is located at " +getIndex +"index");
		System.out.println("Maximum distance is " + maxdis.maxDist(arr,6));

	}

}
 
