class ComplexNumber
{
	double real;
	double imag;
	
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
		
		 ComplexNumber[] n=new ComplexNumber[5];
		 
		 n[0]=new ComplexNumber(1.0,2.0);
		 n[1]=new ComplexNumber(2.0,3.0);
		 n[2]=new ComplexNumber(3.0,4.0);
		 n[3]=new ComplexNumber(4.0,5.0);
		 n[4]=new ComplexNumber(5.0,3.0);
		//ComplexNumber n1=new ComplexNumber(5,7.2);
		//ComplexNumber n2=new ComplexNumber(-3.1,5.7);
		
		 for(int i=0;i<n.length;i++)
		 {
			 n[i].printNumber();
		 }
		 
		 
		/*n1.setReal(5);
		n1.setImag(7.2);
		n2.setReal(-3.1);
		n2.setImag(5.7);*/
		
		/*System.out.print("n1 is -> \t");
		n[0].printNumber();
		
		System.out.print("n2 is -> \t");
		n[1].printNumber();
		
		ComplexNumber n3=n[0].add(n[1]);
		
		System.out.print("n1 + n2 is -> \t");
		n3.printNumber();
		
		System.out.print("n1 - n2 is -> \t");
		n[0].subtract(n[1]).printNumber();*/
	}

}
