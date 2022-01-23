import java.io.*;
class Student {
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
		try {
			if(score<0)
				throw new ScoreException();
			return name+"'s ID is "+ID+" and his/her score is "+score+"\n";
			
		}
		catch(ScoreException e)
		{
			return e.toString();
		}
	}
	public class ScoreException extends Exception
	{
		public ScoreException()
		{
			super("The score is under zero");
		}
	}
	
}
public class IOTest {
	public static void main(String[] args)throws IOException
	{
		try {
			FileReader fin=new FileReader("C:\\Users\\USER\\eclipse-workspace\\Lab09\\src\\data.txt");
			BufferedReader bufReader=new BufferedReader(fin);
			
			File fout=new File("C:\\Users\\USER\\eclipse-workspace\\Lab09\\src\\output.txt");
			BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter(fout));
			
			Student[] sta=new Student[10];
			
			String[] info=new String[3];
			
			String temp;
			int i=0;
			while((temp = bufReader.readLine())!=null)
			{
				sta[i]=new Student();
				info=temp.split(", ");		
				sta[i].setID(Integer.parseInt(info[0]));
				sta[i].setName(info[1]);
				sta[i].setScore(Integer.parseInt(info[2]));
				i++;
			}
			
			for(i=0;i<sta.length;i++)
			{
				bufferedWriter.write(sta[i].toString());
				if(sta[i].getScore()==-1)
					break;
			}
			fin.close();
			bufferedWriter.close();
		}
		catch(IOException e)
		{
			//fin.close();
			//bufferedWriter.close();
			System.out.println(e);
		}
		
	}
	
}
