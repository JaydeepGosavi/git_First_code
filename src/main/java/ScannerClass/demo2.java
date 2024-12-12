package ScannerClass;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 2 names");
		String a,b,c;
		 a=sc.next();
		 b= sc.next();
	
		 c= a+" "+b;
		 
		 System.out.println(c);
		 
		 boolean k=c.equals(a);
		 System.out.println(k);
		
		
	}

}
