public class shape {
	double side;
	double length;
	double bredth;
	public shape(double side) {
		this.side =side;
		
	}
	public shape(double length, double bredth) {
		if (length > 0.0 && length  < 20.0) {
			
			this.length=length;
			this.bredth=bredth;	
		 }
		  else
			{
				System.out.println("Sorry length should not greater then 0.0 and less then 20.0");
				
				
			} }
		public double findAreaofRectangle(){
			return length * bredth;
		}
	
				
	
	
public static void main (String [] args)
{
	shape square = new shape(10.0);
	shape rectangle = new shape(2.7,3.5);
	System.out.println(rectangle.findAreaofRectangle());
	
	
}
}
	 