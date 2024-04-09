public class class1{
	 public static void main(String[] args) 
	 {
	class1 p=new class1();
	double Profit= p.calculateProfitMargin(1000,100);
        System.out.println(Profit);
}
	public double calculateProfitMargin(double revenue,double expense) 
	{
        try {
	        double Profit=((revenue-expense)/revenue);
            return Profit;
        } 
        
        finally 
        {
            System.out.println("finally block is excuted");
        }
    }
}
