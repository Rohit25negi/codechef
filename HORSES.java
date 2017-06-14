import java.util.Scanner;
class HORSES
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		int n;
		long A[];
		long min;
		for(int i=1;i<=T;i++)
		{	
			n=in.nextInt();
			A=new long[n];
			for(int j=0;j<n;j++)
			{
				A[j]=in.nextLong();
			}
			min= Long.MAX_VALUE;
			for(int j=0;j<n;j++)
			{ 	
				for(int k=j+1;k<n;k++)
					{if(Math.abs(A[j]-A[k])<min)min=Math.abs(A[j]-A[k]);}
			}
			System.out.println(min);
		}
	}
}