import java.util.Scanner;
class Bear
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int Q=in.nextInt();
		int a,b,x;
		String msg;
		for(int i=1;i<=Q;i++)
		{	msg="";
			a=in.nextInt();
			b=in.nextInt();
			x=a%2+b%2;
			switch(x)
			{
				case 0: 
				case 2: msg= Math.abs(a-b)==2?"YES":"NO";break;
				case 1:	msg=(a+b-3)%4==0&&Math.abs(a-b)==1?"YES":"NO"; 
				break;
			}
			System.out.println(msg);
		}
	}
}