package String_class;

public class demo1 {

	public void getindex()
	{
		
		
		String  a="1234";
		
		char [] k=a.toCharArray();
		
		for(int i=0;i<k.length;i++)
		{
		
	        if(Character.isAlphabetic(k[i]));
	        {
	        	System.out.println(k[i]);
	        }
		}
		
	}
	public static void main(String[] args) {
		

		demo1 d=new demo1();
	 d.getindex();
	 
		 
		
	}

}
