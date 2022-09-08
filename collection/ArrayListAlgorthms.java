package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListAlgorthms {

	public static void main(String[] args) {
		
		ArrayList<Integer> num=new ArrayList<>();
		num.add(74);
		num.add(1884);
		num.add(987);
		num.add(5);
		num.add(18);
		
		System.out.println(num);
		
		Collections.sort(num);
		System.out.println("sort : "+num);
		
		Collections.shuffle(num);
		System.out.println("shuffle : "+num);
		
		Collections.swap(num, 1, 4);
		System.out.println("swap : "+num);
		
		Collections.reverse(num);
		System.out.println("reverse : "+num);
		
		Collections.rotate(num, 2);
		System.out.println("rotate : "+num);
		
		
		
		
		
		int pos=Collections.binarySearch(num, 18);
		System.out.println("binarySearch : "+ pos);
		
		int count=Collections.frequency(num, 987);
		System.out.println("frequency count : "+ count);
		
		int min=Collections.min(num);
		System.out.println("min : "+min);
		
		
		int max=Collections.max(num);
		System.out.println("max : "+max);
		
		
		
		
		
		ArrayList<Integer> numm=new ArrayList<>();
		numm.addAll(num);
		System.out.println("addAll : "+numm);
		
		Collections.copy(numm, num);
		System.out.println("copy : "+numm);
		
		Collections.fill(num,1);
		System.out.println("fill : "+num);
		
		
		

	}

}
