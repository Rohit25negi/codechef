import java.util.Scanner;
class Bank
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);

		int n;
		float balance;
		n=in.nextInt();
		balance=in.nextFloat();
		if(n%5==0&&n+0.5<=balance)
			balance-=n+0.5;
		System.out.println(balance);
	}
}