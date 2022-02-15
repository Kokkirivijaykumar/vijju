import java.util.LinkedList;
public class UsingEnhancedForLoop {
	public static void main(String[] args)
	    {
	  
	        // Creating a LinkedList of String type
	        LinkedList<String> linkedList = new LinkedList<>();
	  
	        // Inserting some String values to our LinkedList
	        linkedList.add("Geeks");
	        linkedList.add("for");
	        linkedList.add("Geeks");
	  
	        // LinkedList after insertions: ["Geeks", "for",
	        // "Geeks]
	  
	        // Calling the function to iterate our LinkedList
	        iterateUsingEnhancedForLoop(linkedList);
	    }
	  
	    // Function to display LinkedList using Enhanced for
	    // loop
	    public static void iterateUsingEnhancedForLoop(LinkedList<String> linkedList)
	    {
	  
	        System.out.print(
	            "Iterating the LinkedList using enhanced for loop : ");
	  
	        for (String listElement : linkedList) {
	            System.out.print(listElement + " ");
	        }
	    }
	
}
