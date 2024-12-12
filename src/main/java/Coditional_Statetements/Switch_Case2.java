package Coditional_Statetements;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Case2 {

	public static void main(String[] args) {

//		WebDriver driver = new ChromeDriver();

		Scanner sc = new Scanner(System.in);

		String month = sc.nextLine();

		switch (month) 
		{

		case "jan":
			System.out.println("january");
			break;
			
		case "feb":
			System.out.println("feb");
			break;
			
		case "march":
			System.out.println("april");
			
		default :
			System.out.println("enter proper month");

		}

	}

}
