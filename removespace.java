package ex03;

import java.util.Scanner;

public class removespace {

	public static void main(String[] args) {
		

		   
		 Scanner scan = new Scanner(System.in);
			System.out.println("enter the word:");
			String str = scan.nextLine();  
	        str = str.replaceAll(" ", "");    
	            
	        System.out.println( str);    
	    
	}

}
