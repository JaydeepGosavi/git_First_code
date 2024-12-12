package Operators;

public class Increment_Decrement_Operators {

	public static void main(String[] args) {

		int a = 4;
		a++; // 5
		++a; // 6
		System.out.println(a);
		
//-----------------------------------------------------
		int x=5 ,b;
		
		b=x++;           // 1st assign the value then incrememt
		
		System.out.println("value of b when post incremet is " + b);  // 5

// ----------------------------------------------------------------	
		
		int q=5,v;
		
		
		v=++q;         // 1st increment the value then assign
		
		System.out.println("value of v when pre incremenet is "+v);  //6
		
// ------------------------------------------------------------------------
		
		char ch='v';
		
		char p=++ch;
		
		System.out.println("value after incrementing a char is " +p); //w
		
// -------------------------------------------------------------------------
	
		int z=5,l=4, u;
		
		u=2* z++ + 3* ++z;  // 1st z++  = 2 , then 3   and last   4
//		  2 * 5  
//             6     7 
		System.out.println(u);  // 31
		 
		
//	---------------------------------------------------------------------------	
		
	}

}
