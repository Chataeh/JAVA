
 class Point {
	int x,y;
	
	
	Point ()
	{
		x=0;
		y=0;
	}
	void set(int x ,int y)
	{
		this.x=x;
		this.y=y;
	}
	void  showPoint()
	{
		System.out.print( "("+x+", "+y+")");
	}
	public static void main(String[] args) {
		ColorPoint cp=new ColorPoint();
		System.out.println(cp.getClass().getName());
		cp.set(3, 4);
		cp.setColor("red");
		
		cp.showColorPoint();
	}
}
class ColorPoint extends Point
{
	String strColor;
	
	ColorPoint()
	{
		super();
		strColor=" ";
	}
	void setColor(String strColor)
	{
		this.strColor=strColor;
	}
	void showColorPoint()
	{
		System.out.print(strColor);
		showPoint();
	}
}
