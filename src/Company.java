
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
		
}