/* create 3 interfaces names =custId,details,balance inside functions return id,ac type,available balance.

customer class should implement need to implement all those three interface*/

interface CustId{
	public int accountNo(int actno);
	public String IFSC(String code);

	interface CustDetails{
		public String custName(String name);
		public String accountType(String type);

		interface Balance{
			public double availBalance(double amt);			
			
		}
	}
}

class AccountHolders implements CustId.CustDetails.Balance,CustId.CustDetails,CustId{
	public int accountNo(int actno){
		return actno;
	}
        public String IFSC(String code){
		return code;
	}
	public String custName(String name){
		return name;
	}
	public String accountType(String type){
		return type;
	}
	public double availBalance(double amt){
		return amt;	
	}		
}		

public class Main{
	public static void main(String[] args){
		AccountHolders a = new AccountHolders();
		System.out.println("Account No: " + a.accountNo(123456789)); 
      System.out.println("IFSC Code: " + a.IFSC("ABCD123456")); 
      System.out.println("Customer Name: " + a.custName("Ravan")); 
	   System.out.println("Account Type: " + a.accountType("Savings")); 
      System.out.println("Available Balance: " + a.availBalance(10000.00));
    }

}