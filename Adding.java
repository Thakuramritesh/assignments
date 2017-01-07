package assignment.java;

import java.util.Scanner;

public class Adding {

	public static void main(String[] args) {
	System.out.println("enter two nos to be added");
	int x,y,z;
	
	Scanner c=new Scanner(System.in);
	x=c.nextInt();
	y=c.nextInt();
	z=x-(-y);
	System.out.println("the sum is :"+z);
	

	}

}
