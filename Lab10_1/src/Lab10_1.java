import java.util.*;
public class Lab10_1 {
	static int findMax(Vector<Integer> v)
	{
		
		int max =0;
		for(int i=0;i<v.size();i++)
		{
			if(v.get(i)>max)
				max=v.get(i);
		}
		
		
		return max;
				
	}
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>(20);
		
		for(int i=0;i<v.capacity();i++)
		{
			Integer num=(int)((Math.random()*902)+100);
			v.add(num);
		}
		
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		int max=findMax(v);
		int min=Collections.min(v);
		Collections.sort(v);
		
		System.out.print("max = "+max+" ,");
		System.out.println("min = "+min+" ");
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i)+" ");
		}
	}

}
