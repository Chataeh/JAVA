class ComplexNumber
{
	private double real;
	private double imag;
	
	ComplexNumber()
	{
		real=0.0;
		imag=0.0;
	}
	ComplexNumber(double real,double imag)
	{
		this.real=real;
		this.imag=imag;
	}
	
	void setReal(double realPart)
	{
		real=realPart;
	}
	void setImag(double imagPart)
	{
		imag=imagPart;
	}
	
	double getReal()
	{
		return real;
	}
	double getImag()
	{
		return imag;
	}
	double magnitude()
	{
		return Math.sqrt(real*real+imag*imag);
	}
	ComplexNumber add(ComplexNumber n)
	{
		ComplexNumber result;
		result=new ComplexNumber(n.real,n.imag);
		result.real=this.real+n.real;
		result.imag=this.imag+n.imag;
		
		return result;
	}
	
	ComplexNumber subtract(ComplexNumber n)
	{
		ComplexNumber result;
		result=new ComplexNumber(n.real,n.imag);
		result.real=this.real-n.real;
		result.imag=this.imag-n.imag;
		
		return result;
	}
	
	void printNumber()
	{
		System.out.println(real+" + "+imag+"i");
		System.out.println("Magnitude : "+this.magnitude());
	}
	
}
public class Lab04_2 {

	public static void main(String[] args) {
		
		ComplexNumber n1=new ComplexNumber();
		ComplexNumber n2=new ComplexNumber();
		 
		n1.setReal(5);
		n1.setImag(7.2);
		n2.setReal(-3.1);
		n2.setImag(5.7);
		
		System.out.print("n1 is -> \t");
		n1.printNumber();
		
		System.out.print("n2 is -> \t");
		n2.printNumber();
		
		ComplexNumber n3=n1.add(n2);
		
		System.out.print("n1 + n2 is -> \t");
		n3.printNumber();
		
		System.out.print("n1 - n2 is -> \t");
		n1.subtract(n2).printNumber();
	}

}
