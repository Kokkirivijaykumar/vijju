package Constructors;

public class MainMethod {

	public static void main(String[] args) {
Account anshu = new Account(101, "Jeigyanshu", 1008981828, "Jeigyanshu@gmail.com", "7019344265");
Account a1 = new Account("Jeigyanshu", "Jeigyanshu@gmail.com", "7019344625");
System.out.println(a1.getAccountNumber());
System.out.println(a1.getCustomerName());
System.out.println(a1.getBalance());
System.out.println(a1.getCustomerEmailAddress());
System.out.println(a1.getCustomerPhoneNumber());
System.out.println(a1.getDebitCardNumber());

		

	

	}

}
