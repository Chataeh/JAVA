import java.util.Scanner;
public class Lab02_3 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.print("올해 1월 1일은 어떤요일인가요? ");
		String weekday[]= {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		int days[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		String day=in.next();
		
		
		int star=0;
		
		for(int i=0;i<7;i++)
			if(day.equals(weekday[i]))
				star=i;
		
		
		for(int i=1;i<days.length;i++)
		{
			System.out.println(i+"월");
			
			for(int k=0;k<star;k++)
				System.out.print("* ");
					
			for(int j=1;j<=days[i];j++)
			{
				
				System.out.print(j+" ");
				if((j+star)%7==0)
					System.out.println();
				if(j==days[i])
					star=(j+star)%7;
				
			}
			System.out.println();
			
		}
		
	}

}
