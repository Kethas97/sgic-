package ex03;


public class checkNullOrEmpty {
	
/*
	public static void main(String[] args) {
		
			String str="df";
			
			if(str.isEmpty() || str.equals(null)) {
				System.out.println(true);
			}
			
			else {
				System.out.println(false);
			}
	}
}
	*/


public static boolean isNullOrEmpty(String s1)
{
	
	return(s1.isEmpty() || s1.equals(null));
}



public static boolean isAlpha(String s2) 
{
	return(s2!=null &&  s2.matches("^[a-zA-Z0-9]*$"));
	
}



public static void main(String[] args) {
	
	
	System.out.println(isNullOrEmpty("d"));
	
	System.out.println(isAlpha("h"));
	
}
}