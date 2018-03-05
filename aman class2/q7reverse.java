
public class q7reverse {
	public static void main(String[] args)
	{
		int n1=0,r,n,n2;
		n=258;
		n2=n;
		while(n!=0)
		{
			r=n%10;
			n1=n1*10+r;
			n=n/10;
		}
		System.out.println("The reverse of no. "+n2+"is "+n1+"");
	}

}
