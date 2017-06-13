import java.util.Scanner;
class TraingleSum
{
	public static void main(String arg[])
	{
		Scanner in =new Scanner(System.in);
		int T=in.nextInt(),n;
		int A[][],max;
		for(int i=1;i<=T;i++)
		{	
			n=in.nextInt();
			A=new int[n][];
			for(int j=0;j<n;j++)
			{
				A[j]=new int[j+1];
				for(int k=0;k<=j;k++)
					A[j][k]=in.nextInt();
			}
			
			for(int j=1;j<n;j++)
			{
				for(int k=0;k<=j;k++)
				{max=-1;
					if(j-1>=0&&k-1>=0)
						max=A[j-1][k-1]+A[j][k];

					if(j-1>=0&&k<A[j-1].length)
						if(max<A[j-1][k]+A[j][k])
							max=A[j-1][k]+A[j][k];
					A[j][k]=max;	
				}
			}
			max=-1;
			for(int j=0;j<n;j++)
				if(A[n-1][j]>max)max=A[n-1][j];
			System.out.println(max);
		}
	}

}