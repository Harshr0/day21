package Day21;
import java.util.*; 
public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		al.add("A");  
		al.add("B");  
		al.add("C");  
		al.add("D");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
