import java.util.Scanner;
public class Lab02_3 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.print("���� 1�� 1���� ������ΰ���? ");
		String weekday[]= {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		int days[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		String day=in.next();
		
		
		int star=0;
		
		for(int i=0;i<7;i++)
			if(day.equals(weekday[i]))
				star=i;
		
		
		for(int i=1;i<days.length;i++)
		{
			System.out.println(i+"��");
			
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