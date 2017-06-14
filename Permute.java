import java.util.Scanner;
class Permute
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);

		int n;
		int A[];
		boolean yes;
		while((n=in.nextInt())!=0)
		{	yes=true;
			A=new int[n];
			for(int i=0;i<A.length;i++)
			{
				A[i]=in.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				if(A[A[i]-1]!=i+1){
					yes=false;
				}
			}
			if(yes)System.out.println("ambiguous");
			else System.out.println("not ambiguous");

		}
	}
}