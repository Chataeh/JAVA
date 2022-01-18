import java.util.Scanner;
public class Lab01_1 {
	public static void main(String[] args)
	{
char bigger =' ';
		char small=' ';
		System.out.print("영문자를 입력하시오 : ");
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
				System.out.println("영문자가 아닙니다");
		}
		
		
		
	}
}



	
