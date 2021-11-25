package Arrays;

import java.util.Collection;

public class Iterator {

	public static void main(String[] args)throws Exception {
	//	int values[] = new int[4];
	//	Object values1[] = new Object[4];
	//	values1[0] = "Vijay";
	//	values1[1] = 7;
		
		Collection<Integer>values = new Arraylist<Integer>();
		values.add(3);
		values.add(88);
		values.add(99);

		//Iterator i = values.iterator();
		
	//	while(i.hasNext()) {
		//	System.out.println(i.next());
			//System.out.println(i.next());
			//System.out.println(i.next());
		for(Object i : values) {
			System.out.println(i);
		}
		}
	}


