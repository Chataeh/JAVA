abstract class Student
	{
		String name;
		int id;
		Student(String name,int id)
		{
			this.name=name;
			this.id=id;
		}
		abstract int getAnuualSalary();
		String getName()
		{
			return name;	
		}
		int getId()
		{
			return id;
		}
		public String toString()
		{
			return name+"("+id+") : ";
		}
	}

class Undergraduate extends Student
	{
		int semesterSalary;
		Undergraduate(String name,int id,int semesterSalary)
		{
			super(name, id);
			this.semesterSalary=semesterSalary;
		}
		int semesterSalary()
		{
			return semesterSalary;
		}
		int getAnuualSalary()
		{
			return 2*semesterSalary;
		}
		public String toString()
		{
			return name+"("+id+") : Undergraduate Student, semester salary : "+semesterSalary()+", anuual salary : "+getAnuualSalary() ;
		}
	}
class Graduate extends Student
	{
		int monthSalary;
		Graduate(String name,int id,int monthSalary)
		{
			super(name, id);
			this.monthSalary=monthSalary;
		}
		int monthSalary()
		{
			return monthSalary;
		}
		int getAnuualSalary()
		{
			return 12*monthSalary;
		}
		public String toString()
		{
			return name+"("+id+") : Graduate Student, semester salary : "+monthSalary()+", anuual salary : "+getAnuualSalary() ;
		}
	}
public class Lab07 {

	public static void main(String[] args) {
		Student[] s=new Student[8];
		
		s[0]=new Graduate("Giggs",20163103,400000);
		s[1]=new Graduate("Carrick",20163003,500000);
		s[2]=new Graduate("Evra",20155511,350000);
		s[3]=new Graduate("Saha",20143323,550000);
		s[4]=new Undergraduate("Crouch",20170103,1000000);
		s[5]=new Undergraduate("Nevile",20170012,1200000);
		s[6]=new Undergraduate("Ji-sung",20160429,1100000);
		s[7]=new Undergraduate("Ronney",20150718,900000);
		
		
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		int index=0;
		
		for(int i=0;i<s.length;i++)
		{
			if(s[index].getAnuualSalary()<s[i].getAnuualSalary())
				index=i;
		
		}	
		
		System.out.println("\nA student who receives the highest salary :"+s[index].getName()+"("+s[index].getId()+")");
		
	}

}
