import java.util.Scanner;

public class Driver {

	public static void HighestCapital(Company[] obj) {
		int highest = obj[0].Capital();
		int loc = 0;
		for (int i = 1; i < 100; i++) {
			if (highest < obj[i].Capital()) {
				highest = obj[i].Capital();
				loc = i;
			}
		}
		System.out.println("\n\t\t///// Highest Capital Company /////");
		obj[loc].DisplayCompany();
	}

	public static void LowestCapital(Company[] obj) {
		int lowest = obj[0].Capital();
		int loc = 0;
		for (int i = 1; i < 100; i++) {
			if (lowest > obj[i].Capital()) {
				lowest = obj[i].Capital();
				loc = i;
			}
		}
		System.out.println("\n\t\t///// Lowest Capital Company /////");
		obj[loc].DisplayCompany();
	}
	
	
	
	
	
	
	
	
	

	//////// Simulation /////////////
	public static void Simulator(Company[] company, Investor[] investor) {
		
		// Number of transactions .....
		int n = 1;
		int ShareToSell, SharePrice;

		System.out.println("\n\n\t\t ******** TRADING DAY **********\n\n");

		while (!AllCompaniesEmpty(company) && !AllInvestorsEmpty(investor)) {
			int start_investor = 0;

			System.out.println("\n\n \t\t /// Transaction Number " + n + " //\n");
			for (int i = 0; i < 100; i++) {

				if (company[i].IsAbleToShare()) {
					
					//System.out.println("\n Company ID (" + company[i].GetCompanyID() + ") shares : " + company[i].GetNumberOfShares());

					ShareToSell = company[i].SellShare();
					System.out.println("\n >> Company ID (" + company[i].GetCompanyID() + ") sells " + ShareToSell + " shares ");

					// Double up share price ........
					if (ShareToSell >= 10) {

						System.out.println(" Doubling Share Price .... ");
						company[i].DoubleSharePrice();
					}

					System.out.println(" >> Company ID (" + company[i].GetCompanyID() + ") share price " + company[i].GetSharePrice());
					
					// Calculating Total
					SharePrice = ShareToSell * company[i].GetSharePrice();
					System.out.println(" >> Company ID (" + company[i].GetCompanyID() + ") Shares Price : " + SharePrice);
					
					 // This investor cannot any other share 
					for (int j = start_investor; j < 100; j++) {
						if (investor[j].GetBudget() >= SharePrice) {
							
							 // This investor cannot any other share during transaction ...
							start_investor = j + 1;
							investor[j].InvestAmount(SharePrice);
							investor[i].PurchaseShare(ShareToSell);
							System.out.println(">> Investor ID (" + investor[j].GetInvestorID() + ") Purchase "
									+ ShareToSell + " Shares ");
							break;
						}
					}
				} else
					 // If company does not sold any share ........
					company[i].ReduceSharePrice();

			}
			
			n++;
		}
	}

	
	
	
	
	
	
	
	////////////////////// Main Function////////////////////
	public static void main(String[] args) {

		// Creating 100 Companies Dynamically ///
		Company[] companies;
		companies = new Company[100];
		for (int i = 0; i < 100; i++)
			companies[i] = new Company(i + 1 + 100);

		// Creating 100 Investors Dynamically ////
		Investor[] investors;
		investors = new Investor[100];
		for (int i = 0; i < 100; i++)
			investors[i] = new Investor(i + 1 + 2000);

		// Calling simulation function ///
		Simulator(companies, investors);

		// Menu After Simulation stooped ///
		while (true) {
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

			switch (choice) {
			case 1:
				HighestCapital(companies);
				break;
			case 2:
				LowestCapital(companies);
				break;
			case 3:
				CompanyPosition(companies);
				break;
			case 4:
				HighestShare(investors);
				break;
			case 5:
				LowestShare(investors);
				break;
			case 6:
				InvestorPosition(investors);
				break;
			case 0:
				break;
			default:
				System.out.println("\n\n\t >> Invalid Choice ....");
				break;
			}
			if (choice == 0)
				break;
		}

		System.out.println("\n\n\t >> Program Exit ....");

	}

}
