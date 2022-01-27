
public class therad_prime {

	public static void main(String[] args) {
		
		
		int[] array=new int[10];
		
		for(int k=0;k<array.length;k++)
		{
			array[k]=0;
		}
		
		
		int i=2,j=0;
		
		while(true)
		{	
			
			for(int k=2;k<=i;k++)
				{
					if(i%k==0)
					{
						if(i==k)
							{
							array[j]=i;
							if(array[9]!=0)
								break;
							if(array[j]!=0)
								j++;
							}
						else
						{
							break;
						}
					}
					
				}		
			i++;
			if(array[9]!=0)
				break;
		}
		for(int s=0;s<array.length;s++)
		{
			System.out.println(array[s]);
		}
	}

}
