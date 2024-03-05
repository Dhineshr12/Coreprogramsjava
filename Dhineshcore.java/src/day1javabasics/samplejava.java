package day1javabasics;

import java.util.Scanner;
public class samplejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,d;
		Scanner f = new Scanner(System.in);
		System.out.println("Enter the a value");
		a = f.nextInt();
		System.out.println("Enter the d value");
		d = f.nextInt();
		System.out.println(a+d);
		System.out.println(a-d);
		System.out.println(a*d);
		System.out.println(a%d);
	}

}
