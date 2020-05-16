
class Investor {
	
	// investor informations 
	private int Shares;
	private int InvestorID;
	private int Budget;
	
	
	public Investor(int id)
	{
		this.InvestorID = id;
		this.Budget = (int) (Math.random()*(10000 - 1000) + 1000);//budget math
		this.Shares = 0;

	}
	//method updating Shares
	public void UpdateShates( int shares) {
		this.Shares = shares;
	}

	public int TotalShares(){
		return this.Shares;
	}

	public int GetInvestorID() {
		return this.InvestorID;
	}

	public int GetBudget() {
		return this.Budget;
	}
	
	public void DisplayInvestor()	{ // Showing Invetor details .....
		//print the informations of Investor
		System.out.println("\n > Investor ID : " + this.InvestorID);
		System.out.println(" > Investor Budget : " + this.Budget);
		System.out.println(" > Investor Shares : " + this.Shares);
	
}
	public void InvestAmount(int amount) { // Deduct amount from budget .....
		
		this.Budget = this.Budget - amount;
		if(this.Budget < 0)
		this.Budget = 0;
		
	}
	
	public void PurchaseShare(int shares) // Adding up shares .....
	{
		this.Shares = this.Shares + shares;
	
	}
	public boolean IsEmptyBudget() // If budget is ended ...
	{
		if(this.Budget <= 0)
		{
			return true;
		}
		return false;
	}
	
}


