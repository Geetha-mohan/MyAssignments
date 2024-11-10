package week1.day2.HomeAssignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 8;
		
		/* method 1 to fing fibonacci series
		int num1 = 0;
		int num2 = 1;
		int lastnum;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2; i<range; i++)
		{
			lastnum = num1+num2;
			System.out.println(lastnum);
			num1= num2;
			num2 = lastnum;
			
		}*/
		
		
		//method 2 to find fibonacci series 
		FibonacciSeries fs = new FibonacciSeries();
		for(int i=0;i<range;i++) {
			System.out.println(fs.fibonacci(i));
		}

	}
	public int fibonacci(int num)
	{
		
			if(num<=1)
				return num;
			else
				return fibonacci(num-1)+fibonacci(num-2);
	}
	

}
