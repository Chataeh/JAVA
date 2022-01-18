import java.util.Scanner;
public class Lab03_2 {
	static void sort(int[] array)
	{
		int temp=0;
		int max_id=0;
		for(int i=0;i<array.length-1;i++)
		{
			max_id=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[max_id]>array[j])
				{
					max_id=j;
				}
				
			}
			if(i!=max_id)
			{
				temp=array[max_id];
				array[max_id]=array[i];
				array[i]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int[][] lotto=new int[5][6];
		
		byte[] flag=new byte[46];
		int randomNum=0;
		for(int i=0;i<flag.length;i++)
		{
			flag[i]=0;
		}
		
	
		for(int i=0;i<lotto.length;i++)
		{
			for(int j=0;j<lotto[i].length;j++)
			{
					
					
					do
					{
						randomNum=(int)(Math.random()*45)+1;
						if(flag[randomNum]==0)
							{
								flag[randomNum]=1;
								lotto[i][j]=randomNum;
							}
					}while(lotto[i][j]==0);
			}
			sort(lotto[i]);
		}
	
		for(int i=0;i<lotto.length;i++)
		{
			for(int j=0;j<lotto[i].length;j++)
			{
				System.out.print(lotto[i][j]+" ");
			}
			System.out.println();
		}
	}

}
