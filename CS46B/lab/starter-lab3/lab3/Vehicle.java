package transport;

public class Vehicle {
	
	private int nWheels;
	private double xPosition;
	private double yPosition;
	
	Vehicle(int nWheels){
		this.nWheels = nWheels;
		System.out.println("Vehicle constructor");
	}

	public double getxPosition(){
		return  xPosition;
	}

	public double getyPosition(){
		return  yPosition;
	}
	
	public void setxPosition(){
		this.xPosition = xPosition;
	}

	public void setyPosition(){
		this.yPosition = yPosition;
	}

	@Override
	public String toString() {
		return Vehicle;
	}

	public void setPosition(double xPosition, double yPosition){
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	public void changePositionBy(double xDelta, double yDelta){
		this.xPosition += xDelta;
		this.yPosition += yDelta;
	}

	public static void main(String[] args) {
		
	}
}
