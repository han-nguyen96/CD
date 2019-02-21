class Ntn456_CDTester
{
	public static void main (String[] args)
	{
		Ntn456_CD a = new Ntn456_CD(150070.38);

		System.out.println(a.getBalance());

		a.addAnnualInterest();

		a.addAnnualInterest();
	}
	
}