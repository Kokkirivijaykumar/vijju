import java.util.Iterator;
	  
	// Importing LinkedList class from
	// java.util package
	import java.util.LinkedList;
	  
public class UsingIterator {
	public static void main(String[] args) {
	  
	        // Creating a LinkedList of Integer Type
	        LinkedList<Integer> linkedList = new LinkedList<>();
	  
	        // Inserting some Integer values to our LinkedList
	        linkedList.add(5);
	        linkedList.add(100);
	        linkedList.add(41);
	        linkedList.add(40);
	        linkedList.add(7);
	  
	        // LinkedList after insertions : [5, 100, 41, 40, 7]
	  
	        // Calling the function to iterate our LinkedList
	        iterateUsingIterator(linkedList);
	    }
	  
	    // Function to iterate the Linked List using Iterator
	    public static void iterateUsingIterator(LinkedList<Integer> linkedList){
	  
	        System.out.print("Iterating the LinkedList using Iterator : ");
	  
	        // Creating an Iterator to our current LinkedList
	        Iterator it = linkedList.iterator();
	  
	        // Inside the while loop we check if the next element
	        // exists or not if the next element exists then we print
	        // the next element and move to it otherwise we come out
	        // of the loop
	        
	        // hasNext() method return boolean value
	          // It returns true when the next element
	          // exists otherwise returns false
	        while(it.hasNext()){
	  
	            // next() return the next element in the iteration
	            System.out.print(it.next() + " ");
	        }
	  
	    }
	
}
