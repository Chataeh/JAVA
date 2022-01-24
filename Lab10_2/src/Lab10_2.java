import java.util.*;
import java.io.*;
import java.lang.*;
class Student implements Comparable<Student>{
	private int ID;
	private String name;
	private int score;
	
	Student()
	{
		ID=0;
		name=" ";
		score=0;
	}
	Student(int ID, String name,int score)
	{
		this.ID=ID;
		this.name=name;
		this.score=score;
	}
	int getID()
	{
		return ID;
	}
	String getName()
	{
		return name;
	}
	int getScore()
	{
		return score;
	}
	
	void setID(int ID)
	{
		this.ID=ID;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setScore(int score)
	{
		this.score=score;
	}
	public String toString()
	{	
		return name+"'s ID is "+ID+" and his/her score is "+score+"\n";
			
	}
	
	public int compareTo(Student obj)
	{
		return Integer.compare(obj.getScore(),score);
	}
}

public class Lab10_2 {

	public static void main(String[] args)throws IOException {
		try 
		{
		FileReader fin=new FileReader("C:\\Users\\USER\\eclipse-workspace\\Lab10_2\\data.txt");
		BufferedReader bufReader=new BufferedReader(fin);
		
		ArrayList<Student> st= new ArrayList<Student>(8);
		
		String temp=" ";
		
		Student[] sta=new Student[8];
		String[] info=new String[3];
		int i=0;
		while((temp = bufReader.readLine())!=null)
		{
			sta[i]=new Student();
			info=temp.split(",");		
			sta[i].setID(Integer.parseInt(info[0]));
			sta[i].setName(info[1]);
			sta[i].setScore(Integer.parseInt(info[2]));
			i++;
		}
		int maxindex=0;
		
		for(int j=0;j<sta.length;j++)
		{
			st.add(sta[j]);
			if(sta[maxindex].getScore()<sta[j].getScore())
			{
				maxindex=j;
			}
			
		}

		//maxindex=Collections.max(st);
		Collections.sort(st);
		
		for(int k=0;k<st.size();k++)
		{
			System.out.print(st.get(k).toString());
		}
		System.out.print(sta[maxindex]);
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
