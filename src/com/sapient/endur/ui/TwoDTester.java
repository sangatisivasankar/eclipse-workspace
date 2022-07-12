package com.sapient.endur.ui;

public class TwoDTester {

	public static void main(String[] args) {
		// Jagged Array
		String coursesByCategory[][]= {
				{"Java","Java EE","Spring"},
				{"HTML","CSS","Javascript","Bootstrap"},
				{"Hibernate"}

		};
		
		for(int i=0; i<coursesByCategory.length;i++) {
			for(int j=0; j<coursesByCategory[i].length;j++) {
				System.out.print(coursesByCategory[i][j]+",");
			}
			System.out.println();
		}

	}

}


