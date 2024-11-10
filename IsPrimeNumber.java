package week1.day2.HomeAssignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=13;
		boolean flag = checkPrime(n);

		if(flag)
			System.out.println(n + " is prime number");
		else
			System.out.println(n + " is not prime number");

	}

	public static boolean checkPrime(int n)
	{
		for (int i=2; i<n; i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}




