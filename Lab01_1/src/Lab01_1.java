import java.util.Scanner;
public class Lab01_1 {
	public static void main(String[] args)
	{
char bigger =' ';
		char small=' ';
		System.out.print("�����ڸ� �Է��Ͻÿ� : ");
		String str=" ";
		int num=0;
		while(true)
		{
			Scanner in=new Scanner(System.in);
			
			if(in.hasNext()==false)
			{
				System.out.print("exit");
				System.exit(0);
			}
			str=in.next();
			num=(int)str.charAt(0);
			if(num>=65&&num<=90)
			{
				bigger=(char)(num+32);
				System.out.println(bigger);
			}
			else if(num>=97&&num<=122)
			{
				small=(char)(num-32);
				System.out.println(small);
			}
			else
				System.out.println("�����ڰ� �ƴմϴ�");
		}
		
		
		
	}
}



	
