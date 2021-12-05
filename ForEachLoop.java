import java.util.LinkedList;
public class ForEachLoop {	

	    public static void main(String[] args) {
	 
	        LinkedList<Integer> linkedList = new LinkedList<>();
	  
	        linkedList.add(1);
	        linkedList.add(2);
	        linkedList.add(3);
	        linkedList.add(4);
	        linkedList.add(5);
	  
	        iterateUsingForEach(linkedList);
	    }
	  
	    public static void 
	            iterateUsingForEach(LinkedList<Integer> linkedList) {
	    
	        System.out.print("Iterating the LinkedList using for each function : ");
	  
	        linkedList.forEach(
	            (element) -> System.out.print(element + " "));
	    }
	}
	

