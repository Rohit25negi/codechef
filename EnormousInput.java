import java.util.Scanner;
class EnormousInput
{
	public static void main(String argp[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(in.nextInt()%k==0)count++;
		}
		System.out.println(count);
	}
}
