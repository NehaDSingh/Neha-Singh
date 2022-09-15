
public class RectanglePro {

	int length;
	int width;
	
	 RectanglePro()    //default Constructor
	{
		System.out.println("\nDefault Constructor is  called .......");
		length=10;
		width=0;
	}
	 
	 RectanglePro(int length,int width)
	 {
		 System.out.println("\nParameterized Constructor is  called .......");
		 this.length=length;
		 this.width=width;
	 }
	 void area()
	 {
		 int area=width*length;
		 System.out.println("length:- "+length);
		 System.out.println("width:- "+width);
		 System.out.println("Area of Rectangle is:- "+area);
	 }
	 
	public static void main(String[] args)
	{
		RectanglePro rp=new RectanglePro();
		rp.length=10;
		rp.width=5;
		System.out.println("values of rp..... ");
		rp.area();
		
		RectanglePro rp1=new RectanglePro(15,10);
		System.out.println("values of rp1..... ");
		rp1.area();
		
	}

}
