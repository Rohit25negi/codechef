import java.util.Scanner;
class Ladder
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		int n,m;
		for(int i=1;i<=T;i++)
		{
			n=in.nextInt();
			m=in.nextInt();
			System.out.print(Math.sqrt(Math.pow(m,2)-Math.pow(n,2)));
			System.out.print(" "+Math.sqrt(Math.pow(m,2)+Math.pow(n,2)));
			System.out.println();
		
		}
	}

}