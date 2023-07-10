import java.util.Scanner;

public class Fibo
{
	public static void main(String[] args)
	{
		int valueOne=-1;
		int valueTwo=1;
		int limit;
		int result;
		int count=0;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values");
		n=sc.nextInt();
		while(count<n)
		{
			result=valueOne+valueTwo;
			System.out.println(result);
			valueOne = valueTwo;
			valueTwo=result;
			count++;
		}
	}

}
