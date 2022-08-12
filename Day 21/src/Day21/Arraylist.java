package Day21;
import java.util.*;  
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); 
		list.add("Abc");
		list.add("Def");  
		list.add("Pqr");  
		list.add("Xyz");    
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
