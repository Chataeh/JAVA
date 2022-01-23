class Student
{
	private static int staticID=2017000;
	private int studentID;
	private String studentName;
	private double midScore,finalScore;
	
	public Student(){
		studentID=0;
		studentName=" ";
		midScore=0;
		finalScore=0;
	}
	public Student(String studentName ,double midScore,double finalScore)
	{
		studentID=staticID++;
		this.studentName=studentName;
		this.midScore=midScore;
		this.finalScore=finalScore;
	}
	public void setID(int id)
	{
		studentID=id;
	}
	public void setName(String Name)
	{
		studentName=Name;
	}
	public void setmidScore(int mid)
	{
		midScore=mid;
	}
	public void setfinalScore(int fin)
	{
		finalScore=fin;
	}
	public int getID()
	{
		return studentID;
	}
	public String getName()
	{
		return studentName;
	}
	public double setmidScore()
	{
		return midScore;
	}
	public double getfinalScore()
	{
		return finalScore;
	}
	
	public double getAvgScore()
	{
		return (midScore+finalScore)/2.0;
	}
	public String toString()
	{
		return "("+studentID+") "+studentName+" : "+midScore+", "+finalScore+", "+getAvgScore();
	}
	public static Student findBestStudent(Student[] studentArray)
	{
		Student temp=new Student();
		int max_id=0;
		for(int i=0;i<studentArray.length-1;i++)
		{
			max_id=i;
			for(int j=i+1;j<studentArray.length;j++)
			{
				if(studentArray[max_id].getAvgScore()<studentArray[j].getAvgScore())
				{
					max_id=j;
				}
				
			}
			if(i!=max_id)
			{
				temp=studentArray[max_id];
				studentArray[max_id]=studentArray[i];
				studentArray[i]=temp;
			}
		}
		return studentArray[0];
	}
	
	public static Student findWorstStudent(Student[] studentArray)
	{
		Student temp=new Student();
		int max_id=0;
		for(int i=0;i<studentArray.length-1;i++)
		{
			max_id=i;
			for(int j=i+1;j<studentArray.length;j++)
			{
				if(studentArray[max_id].getAvgScore()>studentArray[j].getAvgScore())
				{
					max_id=j;
				}
				
			}
			if(i!=max_id)
			{
				temp=studentArray[max_id];
				studentArray[max_id]=studentArray[i];
				studentArray[i]=temp;
			}
		}
		return studentArray[0];
	}
}
public class Lab05 {

	public static void main(String[] args) {
		Student[] st=new Student[10];
		st[0]=new Student("Jane",57.8,79.5);
		st[1]=new Student("Pole",68.7,77.0);
		st[2]=new Student("John",34.8,56.0);
		st[3]=new Student("Cha",100,92.5);
		st[4]=new Student("Amian",46.5,80.0);
		st[5]=new Student("Kin",42.8,71.0);
		st[6]=new Student("Son",31.8,15.5);
		st[7]=new Student("Oh",89.5,100.0);
		st[8]=new Student("Choi",23.5,10.0);
		st[9]=new Student("Nam",60.5,39.5);
		
		System.out.println("----- Student LIST ((StudentID) NAme,MidScore,FinalScore, AvgScore)-----");
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
			
		}
		System.out.println();
		
		System.out.println("The best student : "+Student.findBestStudent(st));
		System.out.println("The worst student : "+Student.findWorstStudent(st));
		
	}

}
