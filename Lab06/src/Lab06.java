class Employee
{
	protected String name;
	private int salary;
	protected String ID;
	
	Employee()
	{
		name=" ";
		salary=0;
		ID=" ";
	}
	Employee(String name,int salary,String ID)
	{
		this.name=name;
		this.salary=salary;
		this.ID=ID;
	}
	String getName()
	{
		return name;
	}
	int getSalary()
	{
		return salary;
	}
	String getID()
	{
		return ID;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	void getSalary(int salary)
	{
		this.salary=salary;
	}
	void getID(String ID)
	{
		this.ID=ID;
	}
	public String toString()
	{
		return name+"\t"+salary+"\t"+ID;
	}
	
	class Manager extends Employee
	{
		private String department;
		
		Manager()
		{
			super();
			department=" ";
		}
		Manager(String name,int salary,String ID,String department)
		{
			super(name,salary,ID);
			this.department=department;
		}
		public String toString()
		{
			return name+"\t"+salary+"\t"+ID+"\t"+department;
		}
	}



public class Lab06 {
	class EmployeeTest
	{
		Employee e1,e2,e3;
		Manager m1,m2,m3;
		public EmployeeTest()
		{
			e1=new Employee("������",3000000,"kd039482");
			e2=new Employee("���ϸ�",3500000,"ek50426.");
			e3=new Employee();
			m1=new Manager("��Ǹ�",7000000,"lg837593","�λ��");
			m2=new Manager("������",6000000,"je934827","������");
			m3 =new Manager();
			
		}
		public void showInfo()
		{
			String info="�̸�\t����\t���\t�����μ�\n";
			info+="================================================\n";
			info+=e1+"\n"+e2+"\n"+e3+"\n"+m1+"\n"+m2+"\n"+m3;
			System.out.println(info);
		}
	}
	
	public static void main(String[] args) {
		EmployeeTest myTest=new EmployeeTest();
		myTest.showInfo();
		System.exit(0);

	}

}
