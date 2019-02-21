class Ntn456_CD
{
	private double Balance;

	Ntn456_CD(double start_balance)
	{
		this.Balance=start_balance;
	}

	public static final double INTEREST_RATE=.07;

	public void addAnnualInterest()
	{
		double interest= this.Balance*INTEREST_RATE;
		Balance=interest+Balance;

		System.out.println("$"+interest+" of interest has been added to your balance of $"+(Balance-interest)+". Your new balance is $"+Balance+".");

	}

	public String getBalance()
	{
		String str_balance= "$"+String.valueOf(Balance);
		return str_balance;
	}

}

