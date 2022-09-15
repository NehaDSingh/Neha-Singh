
public class PrimeNo {

	
	void primeNumber()
	{
		int i,j;
		for(i=1;i<20;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
			{
				System.out.println(i);
			}
		}
		System.out.println("Print Prime Number Between 1 to 20 :- ");
	}
	public static void main(String[] args) {
	
		PrimeNo pn=new PrimeNo();
		pn.primeNumber();

	}

}
