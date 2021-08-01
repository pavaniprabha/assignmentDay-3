package com.equals;

import java.util.Scanner;

public class EqualsTo {
	public static int x1, x2, y1, y2;
	public static double d1,d2;
	public static Scanner SC = new Scanner(System.in);
	public static void main(String[] args) {
		 System.out.println("Welccome to line comparision Computation program");
		System.out.println("enter first line coordinates\n");
		EqualsTo hello = new EqualsTo();
		hello.Length1();
 
	}
	   public void Input(){
		
		System.out.print("enter x1 point");
		x1 = SC.nextInt();
		System.out.print("enter y1 point");
		y1 = SC.nextInt();
		System.out.print("enter x2 point");
		x2 = SC.nextInt();
		System.out.print("enter y2 point");
		y2 = SC.nextInt();
	   }
	   public void Length1() {
		   Input();
		d1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("length of first line :" +d1);
		Length2();
		}
	   	public void Length2() {
	   		System.out.println("\nenter second line coordinates\n");
	   		Input();
	   		d2 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			System.out.println("length of second line is :" +d2);
	   		if (d1 == d2) {
	   			System.out.println("two lines are  equal in  distance");
	   		}
	   		else
	   		{
	   			System.out.println("not equal in distance");
	   		}
	   	}
}
