
public class Lab02_1 {

	static void printMultTable(int num)
	{
		int[] intArray=new int[num];
		
		for(int i=1;i<=intArray.length;i++)
		{
			
			for(int j=1;j<=i;j++)
				System.out.print(i*j+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMultTable(7);
	}

}
