
public class MainArray {
public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList(2);
		list.addElement("Neeraj");
		System.out.println(list.size());

		list.addElement("Sachin");
		list.addElement("Suresh");
		list.addElement("Vijay");
		list.addElement("Madhu");
		list.addElement("Lokesh");
		list.addElement("Ravi");
		list.addElement("Rajesh");

		System.out.println(list.size());
		
		list.getAllElements();
		
	}

}
