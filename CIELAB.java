import java.util.Scanner;
class CIELAB 
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		char A[]=((a-b)+"").toCharArray();
		A[A.length-1]=(char)((A[A.length-1]-48+1)%10+48);
		if(A[A.length-1]==48)A[A.length-1]+=1;
System.out.println(new String(A));
	}
}