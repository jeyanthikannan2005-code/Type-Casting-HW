import java.util.Scanner;
class CharToInt
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		CharToInt n=new CharToInt();
		n.input();
	}
	void input()
	{
		System.out.print("Enter any character :");
		char character=sc.next().charAt(0);
		int a=operation(character);
		System.out.println("Integer value for respected character :"+a);
	}
	int operation(char c)
	{
		int b=c;
		return b;
	}
}