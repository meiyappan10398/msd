package javabasic;

public class Bus {
	String model;
	double speed;
	public Bus(){
		
	}
	public boolean start() {
		return true;
		
	}
	public void accelerate() {
		
	}
	public static void main(String[]args) {
		Bus car1 = new Bus();
		Bus car2 = new Bus();
		
		car1.speed = 20.0;
		car2.speed = 30.0;
		
		System.out.println(car1.speed);
		System.out.println(car2.speed);
		
	}
	

}
