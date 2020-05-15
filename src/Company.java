
class Company
{
	private int CompanyID;
	private int NumberOfShares;
	private int SharePrice;
	
	public Company(int id)
	{
		this.CompanyID = id;
		this.NumberOfShares = (int) (Math.random()*(1000 - 500) + 500); // 500 - 1000
		this.SharePrice = (int) (Math.random()*(100 - 10) + 10); // 10 - 100
	}
	
	public void ReduceSharePrice() // When no share sold .... 
	{
		int percent = (this.SharePrice * 2) / 100;
		this.SharePrice = this.SharePrice - percent;
	}
	
	public void DoubleSharePrice() // When sold 10 shares ......
	{
		this.SharePrice = this.SharePrice * 2;
	}
	
	public int Capital() // To rank it ..
	{
		return this.NumberOfShares * this.SharePrice;
	}
	
	public void DisplayCompany() // Showing Company details .....
	{
		System.out.println("\n > Company ID : " + this.CompanyID);
		System.out.println(" > Company Shares Number : " + this.NumberOfShares);
		System.out.println(" > Company Share Price : " + this.SharePrice);
	}
	
	public int SellShare() // Selling share any random between 1-10
	{
		int share = (int) (Math.random()*(10) + 1); // Any random share MAXIMUM 20 ...
		this.NumberOfShares = this.NumberOfShares - share;
		return share;
	}
	
	public int GetNumberOfShares()
	{
		return this.NumberOfShares;
	}
	
	public int GetSharePrice()
	{
		return this.SharePrice;
	}
	
	public int GetCompanyID()
	{
		return this.CompanyID;
	}
	
	public boolean IsEmptyShares() // If company shares are ended .....
	{
		if(this.NumberOfShares <= 0)
		{
			return true;
		}
		return false;
	}
	
	public boolean IsAbleToShare()  // If COmpany has enough shares to sell ......
	{
		if(this.NumberOfShares <= 0)
			return false;
		return true;
	}
}

		
		
		
