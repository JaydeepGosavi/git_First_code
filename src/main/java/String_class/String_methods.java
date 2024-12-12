package String_class;

public class String_methods {

	public static void main(String[] args) {
		String a="madam";
		
		
		String rev="";
		
		for (int i=a.length()-1;i>=0;i--)
		{
			
			rev=rev+a.charAt(i);
			
		}
		
		if (a.equals(rev))
		{
			System.out.println(rev);
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
