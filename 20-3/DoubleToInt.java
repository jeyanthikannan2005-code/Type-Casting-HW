import java.util.Scanner;
class DoubleToInt
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		DoubleToInt n=new DoubleToInt();
		n.input();
	}
	void input()
	{
		System.out.print("Enter a value in Double :");
		double value=sc.nextDouble();
		int a=operation(value);
		System.out.println("Integer value for respected Double :"+a);
	}
	int operation(double d)
	{
		int b=(int)d;
		return b;
	}
}