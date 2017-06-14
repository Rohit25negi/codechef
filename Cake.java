import java.util.Scanner;
class Cake
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		int A[];
		char B[];

		for(int i=1;i<=T;i++)
		{
			A=new int[26];
			B=in.next().toCharArray();
			for(int j=0;j<B.length;j++)
			{
				A[B[j]-97]++;
			}
			int j;
			for(j=0;j<26;j++)
				{
					if(A[j]!=0)
					{
						if(A[j]==B.length-A[j])break;
					}
				}
				if(j==26)System.out.println("NO");
				else System.out.println("YES");
		}
	}
}
