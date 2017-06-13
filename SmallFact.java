import java.util.Scanner;

class SmallFact
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		BigInteger b;
		
		int n;
		
		for(int i=1;i<=T;i++)
		{
			n=in.nextInt();
			b=new BigInteger("1");
			for(int j=n;j>1;j--)
				b=b.multiply(new BigInteger(j+""));
			System.out.println(b);
		}
	}

}