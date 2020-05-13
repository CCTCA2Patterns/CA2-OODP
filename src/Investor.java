
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

	public int getInvestorID() {
		return InvestorID;
	}

	public void setInvestorID(int investorID) {
		InvestorID = investorID;
	}

	public int getBudget() {
		return Budget;
	}

	public void setBudget(int budget) {
		Budget = budget;
	}

	public int getShares() {
		return Shares;
	}

	public void setShares(int shares) {
		Shares = shares;
	}
	
	
	public void DisplayInvestor() // Showing Invetor details .....
	{
		System.out.println("\n > Investor ID : " + this.InvestorID);
		System.out.println(" > Investor Budget : " + this.Budget);
		System.out.println(" > Investor Shares : " + this.Shares);
	
}
	
	
}