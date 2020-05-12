
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
	
}
