import java.util.Scanner;
public class Lab02_2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int height=0;
		do
		{
		System.out.print("Enter the height : ");
		height=in.nextInt();
		}while(height<=0);
			
		
		for(int i=1;i<=height;i++)
		{
			for(int j=0; j<i-1;j++)
				System.out.print("*");
			
			for(int k=2*(height-i);k>=0;k--)
				System.out.print(" ");
			
			for(int j=0; j<i-1;j++)
				System.out.print("*");
			
			System.out.println();
		}
		for(int i=0;i<2*height-1;i++)
			System.out.print("*");
	}
	
}
