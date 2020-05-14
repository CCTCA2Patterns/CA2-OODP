
class Investor
{
	private int InvestorID;
	private int Budget;
	private int Shares;
	
	public Investor(int id)
	{
		this.InvestorID = id;
		this.Budget = (int) (Math.random()*(10000 - 1000) + 1000);
		this.Shares = 0;
	

	}

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
	
	
	public void DisplayInvestor() // Showing Invetor details .....
	{
		System.out.println("\n > Investor ID : " + this.InvestorID);
		System.out.println(" > Investor Budget : " + this.Budget);
		System.out.println(" > Investor Shares : " + this.Shares);
	
}
	
	
}