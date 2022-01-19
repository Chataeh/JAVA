class Rectangle{
	int x1;
	int y1;
	int x2;
	int y2;
	
	Rectangle()
	{
		x1=0;
		x2=0;
		y1=0;
		y2=0;
	}
	Rectangle(int x1,int y1,int x2,int y2)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	
	void set(int x1,int y1,int x2,int y2)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	boolean check()
	{
		if(x1==x2||y1==y2)
			return false;
		else
			return true;
	}
	
	int getArea()
	{
		int width=0;
		int x=0;
		int y=0;
		if(x1>x2)
			x=x1-x2;
		else 
			x=x2-x1;
		
		if(y1>y2)
			y=y1-y2;
		else
			y=y2-1;
		width=(x*y);
		
		return width;
	}
	
	void show()
	{
		if(check())
			System.out.println("("+x1+","+y1+"), ("+x2+","+y1+"), ("+x2+","+y2+"), ("+x1+","+y2+")");
		else
			System.out.println("직사각형이 아닙니다");
	}
	
	boolean equals(Rectangle r)
	{
		if(this.getArea()==r.getArea())
			return true;
		else
			return false;
	}
}


public class Lab04_1 {
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Rectangle s=new Rectangle(1,1,2,3);
		
		r.show();
		s.show();
		
		System.out.println(s.getArea());
		r.set(2, 1, 4, 5);
		r.show();
		System.out.println(r.getArea());
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다");
	}
}
