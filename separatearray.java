
public class separatearray {

	public static void main(String[] args) {
		
		String fruit="apple,banana,pineapple,avacoda";
		  char[] temp1=fruit.toCharArray();
		  
		for(int i=0; i<fruit.length();i++)
		  {
			  if(fruit.charAt(i)!=',')
			  {
				  System.out.print(temp1[i]);
			  }
			  else
			  {
				  System.out.println();
			  }
		  }
	  }
	}


