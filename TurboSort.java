import java.util.TreeSet;
import java.util.Scanner;
import java.util.Comparator;
class Com implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		if(((Integer)o1).compareTo((Integer)o2)<0)
		{
			return -1;
		}else return 1;		
	}
}
class TurboSort
{
	public static void main(String arg[])
	{
		TreeSet<Integer>set=new TreeSet(new Com( ));
		Scanner in=new Scanner(System.in);
		int T=in.nextInt(),n;
		for(int i=1;i<=T;i++)
		{	
			set.add(in.nextInt());

		}
		for(int s:set)
			System.out.println(s);
	}
}