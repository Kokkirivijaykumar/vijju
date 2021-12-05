package Constructors;

public class constructor {

	public static void main(String[] args) {
		public class Account{

			private int accountNumber;
			private String customerName;
			private double balance;
			private String customerEmailAddress;
			private String customerPhoneNumber;
			private String debitCardNumber;

			public Account() {
				this(0000, "defaultCustomerName", 0.00, "default@email.com", "1111111111", "2222222222");
				System.out.println("secondary constructor called");
			}

			public Account(int accountNumber, String customerName, double balance, String customerEmailAddress,
					String customerPhoneNumber, String debitCardNumber) {

				this.accountNumber = accountNumber;
				this.customerName = customerName;
				this.balance = balance;
				this.customerEmailAddress = customerEmailAddress;
				this.customerPhoneNumber = customerPhoneNumber;
				this.debitCardNumber = debitCardNumber;

				System.out.println("main constructor called");
			}

			public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
				this(1111, customerName, 50.00, customerEmailAddress, customerPhoneNumber, "5555555555");
				System.out.println("customized constructor called");

			}

			public int getAccountNumber() {
				return accountNumber;
			}

			public String getCustomerName() {
				return customerName;
			}

			public double getBalance() {
				return balance;
			}

			public String getCustomerEmailAddress() {
				return customerEmailAddress;
			}

			public String getCustomerPhoneNumber() {
				return customerPhoneNumber;
			}

			public String getDebitCardNumber() {
				return debitCardNumber;
			}

		}

	}

}
