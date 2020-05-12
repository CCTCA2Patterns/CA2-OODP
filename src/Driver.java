
public class Driver {

	public static void main(String[] args) {
	
		// Creating 100 Companies Dynamically ....
			Company []companies;
			companies=new Company[100];
	        for (int i=0;i<100;i++)
	        	companies[i]= new Company(i+1+100);
	        
	        // Creating 100 Investors Dynamically ....
	        Investor []investors;
	        investors =new Investor[100];
	        for (int i=0;i<100;i++)
	            investors[i]= new Investor(i+1+100);

	}
}
	
