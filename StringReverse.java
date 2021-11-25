package Arrays;

public class StringReverse {

	public static void main(String[] args) {
		String s = "vijaymad";
		int leng = s.length();
		String rev =" ";
		for(int i=leng-1; i>=0; i++) {
			rev = rev+s.charAt(i);
			}
		System.out.println("Reverse of"+ "name" +"is"+rev);
		

	}

	}
