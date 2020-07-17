package moonTour;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> m =new LinkedHashMap();
		m.put(10,"s" );
		m.put(12, "A");
		m.put(13,"sanju" );
		m.put(12, "Arjun");
        System.out.println(m);
        
   String s=m.get(13);
   System.out.println(s);
Set <Integer> keys=m.keySet();
System.out.println(keys);
 Collection<String> st=m.values();
 System.out.println(st);
Set<Entry<Integer,String>> ent= m.entrySet();  

for(Entry<Integer,String> x:ent)
{
	System.out.println(x);
Integer k=	x.getKey();
System.out.println(k);
 String ss= x.getValue();
 System.out.println(ss);

	
}


}











	}



