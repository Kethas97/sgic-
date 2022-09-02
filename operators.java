package operation;

public class operators {
	

public static void arithmetic(int a, int b) {

	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
}



public static void unary(int c,int d) {

	System.out.println(c++ + ++d);
	System.out.println(++c + d++);
	
	System.out.println(c-- + --d);
	System.out.println(--c + d--);
	
	System.out.println(--c + d++);
	System.out.println(c++ + d--);
	

	System.out.println(~c);
	System.out.println(~d);
	
}

public static void shift(int e,int f) {

	System.out.println(e<<f);
	System.out.println(e>>f);
}



public static void logical(int g,int h,int i) {
	
	System.out.println(g+h>g+i && g>i);
	System.out.println(g+h>g+i || g>i);
}


public static void ternary(int x, int y) {
	int min=x<y?x:y;
	System.out.println(min);
}
}