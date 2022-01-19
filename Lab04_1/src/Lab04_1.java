class Rectangle{
	int x1;
	int y1;
	int x2;
	int y2;
}


public class Lab04_1 {

	public static void main(String[] args) {
		Person p;
		p=new Person(20);
		p.name="test";
		
		
		int i=p.age;
		
		String str=p.getName();
		
		System.out.print("name = "+str+"  age = "+i);
	}
}
