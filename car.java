package javabasic;

public class Car11 {
	public static final int i = 1;
	private String model;
	int i11=10;
	private double speed=20;
	public int i1;
	public Car11() {
		System.out.println("empty cons called");
	}   
	public void Car111(int speed) {
		
		this.speed=speed;
	System.out.println("one arg cons called");
	}
	public void Car112(int speed,String model) {
		
		this.speed=speed;
		this.model=model;
		
		System.out.println("two arg cons called");
	}
	
	public String getModel() {
		return model;
		
	}
	public void setModel(String model) {
		this.model=model;
		
	}
	public double getSpeed() {
		return speed;
	}
	
	
	public boolean start() {
		return true;

		}
	public void  accelerate() {
		speed +=10;
	}

	public void accelerate1(int speed){}
	public void accelerate(double speed) {}
	public void accelerate(int speed,String mod) {}
	public void accelerate(String mod,int speed) {}


	public void changeInt(int i) {
	i=i+10;
	}

		public static void main(String args[]) {
		Car car11= new Car();
		Car car111= new Car();
			
		
	car11.speed=100.0;
	car111.speed=50.0;
	System.out.println(car11.speed);
	System.out.println(car111.speed);
	int count=700;
	System.out.println(count);

	}
		
			
		}
			
		
		
		