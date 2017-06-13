import java.util.Scanner;
import java.util.TreeMap;
class TrailingZeroes
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		int n,count,prev,temp,x;
		
		for(int i=1;i<=T;i++)
		{
			n=in.nextInt();
			temp=(int)(Math.log(n)/Math.log(5));
			prev=0;
			count=0;
			while(temp>0)
			{		
				x=n/(int)Math.pow(5,temp);
				count+=(x-prev)*temp;
				prev=x;
				temp--;
			}
			System.out.println(count);

		}
	}
}