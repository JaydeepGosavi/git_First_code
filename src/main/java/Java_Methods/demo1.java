package Java_Methods;

import java.util.Scanner;

public class demo1 {

	
public static String palidrome(String a)
{
	Scanner sc=new Scanner(System.in);
	
	a=sc.nextLine();
	String rev="";
	
	for(int i= a.length()-1;i>=0;i--)
	{
		rev=rev+a.charAt(i);
	}
	if(rev.equals(a))
	{
		System.out.println(rev + " is palindrome");
	}
	
	else
	{
		System.out.println(rev + " is not palindrome");
	}
	
	return rev;
	
}
	public static void main(String[] args) {
	
		String k=palidrome("ram");
		
		
	}

}
