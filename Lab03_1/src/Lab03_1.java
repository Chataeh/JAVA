import java.util.Scanner;
public class Lab03_1 {
	
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
		
		Scanner in=new Scanner(System.in);
		
		int [] array=new int[10];
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=in.nextInt();
		}
		sort(array);
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
