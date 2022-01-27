
public class Prime_Number {

	public static void main(String[] args) {
		int[] array=new int[10000];
		for(int k=0;k<array.length;k++)
		{
			array[k]=0;
		}
		;
		Thread th1= new findThread("1",array);
		Thread th2= new findThread("2",array);
		Thread th3= new findThread("3",array);
		Thread th4= new findThread("4",array);
		Thread th5= new findThread("5",array);
		Thread th6= new findThread("6",array);
		Thread th7= new findThread("7",array);
		Thread th8= new findThread("8",array);
		Thread th9= new findThread("9",array);
		Thread th10= new findThread("10",array);

		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		th8.start();
		th9.start();
		th10.start();
		
		
		
		
		try {
			th1.join();
			th2.join();
			th3.join();
			th4.join();
			th5.join();
			th6.join();
			th7.join();
			th8.join();
			th9.join();
			th10.join();
			
		}
		catch(Exception e) {
			
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	
	
}
class SyncObject
{
	synchronized void find(int[] array)
	{
		int i=2,j=0;
		
		
		while(true)
		{	
			
			for(int k=2;k<=i;k++)
				{
					if(i%k==0)
					{
						if(i!=k)
							break;
						else
						{
							array[j]=i;
							//System.out.println(i);
							if(array[9999]!=0)
								break;
							if(array[j]!=0)
								j++;
						}
					}
				
				
				}		
			i++;
			if(array[9999]!=0)
				break;
		}
	}
}

class findThread extends Thread
{
	SyncObject sObj =new SyncObject();
	int[] array=new int[10000];
	findThread(String name,int[] array)
	{
		super(name);
		this.array=array;
	}
	
	
	
	public void run()
	{
		
		sObj.find(array);
		/*for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}*/
	}
}