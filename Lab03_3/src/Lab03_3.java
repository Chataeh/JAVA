import java.util.Scanner;
public class Lab03_3 {

	public static void main(String[] args) {
		int max=0,sum=0;
		double s=0.0,S=0.0;
		int num[];
		System.out.println("세변의 길이를 입력하시오");
		String str=" ";
		
		
		num=new int[3];
		Scanner in=new Scanner(System.in);
		
		str=in.nextLine();
		
		String[] tri=str.split(" ");
		for(int i=0;i<tri.length;i++)
			num[i]=Integer.parseInt(tri[i]);
		
		
		for(int i=0;i<3;i++)
		{
			if(max<num[i])
			{
				max=num[i];
			}
		}
		for(int i=0;i<3;i++)
		{
			if(num[i]!=max)
				sum+=num[i];
		}
		
		if(max<sum)
			{
				s=(double)(num[0]+num[1]+num[2])/2;
				S=Math.sqrt(s*(s-num[0])*(s-num[1])*(s-num[2]));
				System.out.print("S = ");
				System.out.print(S);
				
			}
		
	}

	

}
