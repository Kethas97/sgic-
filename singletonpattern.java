package ex03;

public class singletonpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sinleton pattern=sinleton.getInstance();
		String n=pattern.s1("dsa");
		System.out.println(n);
	}

}
