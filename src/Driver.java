import java.util.Scanner;

public class Driver {
	
	
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
	
	
	
	public static void CompanyPosition(Company[] obj)
	{
		//////// Top Companies //////////
		int []locs= new int[20];
		int highest = obj[0].Capital();
		locs[0] = 0;
		int idx = 1, j=0;
		for(int i=1; i<100; i++)
		{
			if(highest < obj[i].Capital())
			{
				highest = obj[i].Capital();
				locs[0] = i;
			}
			else if(highest == obj[i].Capital())
			{
				locs[idx] = i;
				idx++;
			}
		}
			

	}
	
	public static void HighestShare(Investor[] obj)
	{
		int highest = obj[0].TotalShares();
		int loc = 0;
		for(int i=1; i<100; i++)
		{
			if(highest < obj[i].TotalShares())
			{
				highest = obj[i].TotalShares();
				loc = i;
			}
		}
		System.out.println("\n\t\t///// Highest Share Investor /////");
		obj[loc].DisplayInvestor();
	}
	
	public static void LowestShare(Investor[] obj)
	{
		int lowest = obj[0].TotalShares();
		int loc = 0;
		for(int i=1; i<100; i++)
		{
			if(lowest > obj[i].TotalShares())
			{
				lowest = obj[i].TotalShares();
				loc = i;
			}
		}
		System.out.println("\n\t\t///// Lowest Share Investor /////");
		obj[loc].DisplayInvestor();
	}
	
	public static void InvestorPosition(Investor[] obj)
	{
		////////Top Investors //////////
		int []locs= new int[10];
		int highest = obj[0].TotalShares();
		locs[0] = 0;
		int idx = 1, j=0;
		for(int i=1; i<100; i++)
		{
			if(highest < obj[i].TotalShares())
			{
				highest = obj[i].TotalShares();
				locs[0] = i;
			}
			else if(highest == obj[i].TotalShares())
			{
				locs[idx] = i;
				idx++;
			}
	
		}
		
		/////// Bottom Investors ///////
		int lowest = obj[0].TotalShares();
		int []locs2 = new int[10];
		locs2[0] = 0;
		idx = 1;
		for(int i=1; i<100; i++)
		{
			if(lowest > obj[i].TotalShares())
			{
				lowest = obj[i].TotalShares();
				locs2[0] = i;
			}
			else if(lowest == obj[i].TotalShares())
			{
				locs2[idx] = i;
				idx++;
			}
		}
		System.out.println("\n\t\t///// BOTTOM Position Investors /////");
		for(int i=0; i<idx; i++)
		{
			j = locs2[i];
			obj[j].DisplayInvestor();
		}
	}
	
	
	public static boolean AllCompaniesEmpty(Company[] company) // When all companies share are ended ...
	{
		int i;
		for(i=0; i<100; i++)
		{
			if(!company[i].IsEmptyShares())
				break;
		}
		if(i == 100)
			return true;
		else
			return false;
	}
	
	
	public static boolean AllInvestorsEmpty(Investor[] investors) // When all Investors Budget is ended ......
	{
		int i;
		for(i=0; i<100; i++)
		{
			if(!investors[i].IsEmptyBudget())
				break;
		}
		if(i == 100)
			return true;
		else
			return false;
	}
	
	//Main Function
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
	            investors[i]= new Investor(i+1+2000);
	        
	     // Calling simulation function ...........
	        Simulator(companies, investors);
	        
	        // Menu After Simulation stooped ..........
	        while(true)
	        {
	         	System.out.println("\n\n\t\t //// SIMULATION RESULTS /////\n");
	        	System.out.println("\n\t\t >> ( Press 1 ) for Compay with Highest Capital");
	        	System.out.println("\t\t >> ( Press 2 ) for Compay with Lowest Capital");
	        	System.out.println("\t\t >> ( Press 3 ) for Compay Position");
	        	System.out.println("\n\t\t >> ( Press 4 ) for Investor with Highest Shares");
	        	System.out.println("\t\t >> ( Press 5 ) for Investor with Lowest Shares");
	        	System.out.println("\t\t >> ( Press 6 ) for Investor Position");
	        	System.out.println("\t\t >> ( Press 0 ) for Exit Program");
	        	System.out.println("\n\t\t >> Your Choice : ");
	        	Scanner input = new Scanner(System.in);
	        	int choice = input.nextInt();
	        
	        	switch(choice)
	        	{
	        	case 1: HighestCapital(companies);
	        		break;
	        	case 2: LowestCapital(companies);
	        		break;
	        	case 3: CompanyPosition(companies);
	        		break;
	        	case 4: HighestShare(investors);
	        		break;
	        	case 5: LowestShare(investors);
	        		break;
	        	case 6: InvestorPosition(investors);
	        		break;
	        	case 0: 
	        		break;
	        	default:
	        		System.out.println("\n\n\t >> Invalid Choice ...."); break;
	        	}
	        	if(choice == 0)
	        		break;
	        }
	        
	        System.out.println("\n\n\t >> Program Exit ....");
	        
	        
	        

	}
	
}
	
