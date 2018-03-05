
public class q5_pallind{
	public static void main(String[] args)
	{
		int a,n1,n=1001,sum=0;
		n1=n;
		while(n!=0)
		{
			a=n%10;
			sum=sum*10+a;
			n=n/10;
		}
		
	if(sum==n1)
			System.out.println("the no."+n1+"is pallindrome");
		else
		{
			System.out.println("the no."+n1+" is not pallindrome");
			
		}
		
		}
	

}
