
class Company {
	
		private int CompanyID;
		private int NumberOfShares;
		private int SharePrice;
		
		public Company(int id)
		{
			this.CompanyID = id;
			this.NumberOfShares = (int) (Math.random()*(1000 - 500) + 500); // 500 - 1000
			this.SharePrice = (int) (Math.random()*(100 - 10) + 10); // 10 - 100
		
		}
		public int Capital() // To rank it ..
		{
			return this.NumberOfShares * this.SharePrice;
		}
		
		
		
		public void DisplayCompany() {// Showing Company details .....
			
			System.out.println("\n > Company ID : " + this.CompanyID);
			System.out.println(" > Company Shares Number : " + this.NumberOfShares);
			System.out.println(" > Company Share Price : " + this.SharePrice);
			
		}
		public int SellShare() { // Selling share any random between 1-10
		int share = (int) (Math.random()*(10) + 1); // Any random share MAXIMUM 20 ...
		this.NumberOfShares = this.NumberOfShares - share;
		return share;	
			
		}
		
		
		
		
}