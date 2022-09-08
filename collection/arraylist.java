package collection;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		
		al.add(45);
		al.add(11);
		al.add('k');
		al.add("billa");
		al.add(4664);
	
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(3, 47.24);
		System.out.println(al);
		
		System.out.println(al.add('h'));// h add and true  but not display arrayList
		System.out.println(al);
		 
		System.out.println(al.contains("billa"));
		System.out.println(al.contains("devid"));
		
		System.out.println(al.get(5));
		System.out.println(al.set(2, "MGR"));// modify elements
		System.out.println(al);
		
		
		System.out.println(al.indexOf("billa"));
		
		
		System.out.println(al.remove(1));
		System.out.println(al);
		
		
		
		
		ArrayList al2=new ArrayList();
		al2.addAll(al);
		
		System.out.println("al : "+al);
		System.out.println("al2 : "+al2);
		
		
		al2.addAll(2, al);
		System.out.println("al2 : "+al2);
		
		
		System.out.println(al.subList(2, 4));
		List al3=al.subList(2, 4);
		System.out.println("al3 : "+al3);
		
		al3.removeAll(al3);
		System.out.println("al3 : "+al3);
		
		
		
		
	}

}
