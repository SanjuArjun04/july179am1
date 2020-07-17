package moonTour;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		
		List <Integer> li=new ArrayList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(2);
		li.add(5);
		li.add(6);
		li.add(2);
		li.add(7);
		li.add(2);
		System.out.println(li);
		
		for(int i=0;i<li.size();i++) {
			if(li.get(i)==2) {
				li.set(i, 20);
				//System.out.println(li);
			}
			
		}
		System.out.println(li);
		
		
		/*Integer in=li.indexOf(2);
		System.out.println(in);
		int lo=li.lastIndexOf(2);
		System.out.println(lo);
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i)==2)
			{
				li.set(i, 20);
				System.out.println(i);
			}
			
		}
		System.out.println(li);
		*/
		
		
		
	
		
		
		
			


		
		
			
			
			
			
	
		



	}

}
