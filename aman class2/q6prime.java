
public class q6prime {
	public static void main(String[] args)
	{
	int n,c=0,i;
	n=23;
	for(i=2;i<n;i++)
	{
	if(n%i==0)
		c++;
	}
	if(c==0)
		System.out.println("The no. "+n+"   is prime");
	else
		System.out.println("The no. "+n+" is not prime");
	
	}
}
