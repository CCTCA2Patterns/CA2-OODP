
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
	public static void HighestCapital(Company []obj)
	{
		int highest = obj[0].Capital();
		int loc = 0;
		for(int i=1; i<100; i++)
		{
			if(highest < obj[i].Capital())
			{
				highest = obj[i].Capital();
				loc = i;
			}
		}
		System.out.println("\n\t\t///// Highest Capital Company /////");
		obj[loc].DisplayCompany();
	}
	
	public static void LowestCapital(Company[] obj)
	{
		int lowest = obj[0].Capital();
		int loc = 0;
		for(int i=1; i<100; i++)
		{
			if(lowest > obj[i].Capital())
			{
				lowest = obj[i].Capital();
				loc = i;
			}
		}
		System.out.println("\n\t\t///// Lowest Capital Company /////");
		obj[loc].DisplayCompany();
	}
}
	
