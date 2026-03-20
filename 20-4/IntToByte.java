import java.util.Scanner;
class IntToByte
{
	Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		IntToByte n=new IntToByte();
		n.input();
	}
	void input()
	{
		System.out.print("Enter the integer value :");
		int value=sc.nextInt();
		byte a=operation(value);
		System.out.println("Byte value for the respected integer value :"+a);
	}
	byte operation(int i)
	{
		byte b=(byte)i;
		return b;
	}
}