
import java.util.ArrayList;

public class MyArrayList {

	private Object[] myArray;
	private int position = 0;
	
	public MyArrayList(int size) {
		this.myArray = new Object[size];		
	}

	public void addElement(Object obj) {

		if (this.position >= this.size()) {
			grow();
		}

		this.myArray[position] = obj;
		position++;
	}

	private Object[] grow() {
		Object[] temp = this.myArray;
		this.myArray = new Object[this.size() * 2];
		for (int i = 0; i < temp.length; i++) {
			this.myArray[i] = temp[i];
		}
		return myArray;

	}

	public int size() {
		return this.myArray.length;
	}

	public Object getElement(int index) {
		return this.myArray[index];
	}

	public void getAllElements() {
		for (Object item : myArray) {
			System.out.print(item + " , ");
		}
	}



}
