
public class BankAccount {
	private int money;
	public BankAccount(int money) {
		this.money=money;
	}	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money=money;
	}
	public static void testBankAccount() {
		BankAccount B=new BankAccount(1000);	//create a new object
		System.out.println(B.getMoney()==1000);
		//test the money in the account when a new account is created
		B.setMoney(1500);
		System.out.println(B.getMoney()==1500);
		//Test the money in the account after seting money
		
	}
}