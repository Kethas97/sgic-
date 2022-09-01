package ex03;

import java.util.Scanner;

public class spaceremove {
public static void main(String[]args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the word:");
	String s1 = scan.nextLine();
	
	char[] ch = s1.toCharArray();
	String out= "";

	for(
	int i = 0;i<s1.length();i++)
	{

		if (ch[i] == ' ') {
			continue;
		}

		else {
			out += ch[i];
		}
	}System.out.println(out);
}}
