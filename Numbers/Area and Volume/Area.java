// Write a java Program to find Area of circle, triangle, parallelogram, trapezium and rhombus

package areaAndVoulme;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {	
		areaofcircle();
		areaofTraingle();
		areaofparallelograms();
        areaoftrapezium();
		areaofrhombus();
	}
	public static void areaofcircle() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Circle: ");
		int r = sc.nextInt();
		sc.close();
		//Area of circle A=πr2
		
		if(r <= 0) {
			System.out.println("Wrong Input.");
			return;
		}else {
			double area = 3.14*r*r;
			System.out.println("Area of Circle: "+ area);
		}
	}
	
	public static void areaofTraingle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height of traingle: ");
		int height = sc.nextInt();

		System.out.println("Enter Base of Traingle: ");
		int base = sc.nextInt();
		sc.close();
		
		if(height <= 0 || base <= 0) {
			System.out.println("Wrong input.");
			return;
		}else {
			double area = 0.5 * base * height;
			System.out.println("Area of traingle: "+area);
		}
	}
	
	public static void areaofparallelograms() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base of Parallelogram: ");
		int base = sc.nextInt();
		System.out.println("Enter height of Parallelogram: ");
		int height = sc.nextInt();
		sc.close();
		
		if(base <= 0 || height <= 0) {
			System.out.println("Wrong input.");
			return;
		}else {
			double area = base*height;
			System.out.println("Area of Parallelogram: "+area);
		}
	}
	
	public static void areaoftrapezium() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Parallel side and height of trapezium: ");
		System.out.println("Parallel side One: ");
		int a = sc.nextInt();
		System.out.println("Parallel side two: ");
		int b = sc.nextInt();
		System.out.println("Enter height of trapezium: ");
		int height = sc.nextInt();
		sc.close();
		
		if(a<=0 || b<=0 || height<=0) {
			System.out.println("Wrong input.");
			return;
		}else {
			int area = (a+b)*height/2;
			System.out.println("Area of trapezium: "+area);
		}
	}
	
	public static void areaofrhombus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Diagonal length d1: ");
		int d1 = sc.nextInt();
		System.out.println("Enter Diagonal length d2: ");
		int d2 = sc.nextInt();
		sc.close();
		
		if(d1 <= 0 || d2 <= 0) {
			System.out.println("Wrong input.");
			return;
		}else {
			double area = 0.5 * d1* d2;
			System.out.println("Area of Rhombus: "+area);
		}
	}

}
