import java.util.Scanner;
class IntToDouble
{
	Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		IntToDouble n=new IntToDouble();
		n.read();
	}
	void read()
	{
		System.out.print("Enter any integer value :");
		int value=sc.nextInt();
		double b=typecast(value);
		System.out.print("Double value for respected integer value :"+b);
	}
	double typecast(int a)
	{ 
		double d=a;
		return d;
	}
}