
public class RaceCar implements IRacer {
	public String myName;//The name of the race car (e.g. "Racer X")
	public double myMaxSpeed;//The maximum speed the car can travel (i.e. 15.0)
	public double myAcceleration;//How much the car will increase its speed in a single interval of time
	public double myCurrentSpeed;//The current speed of the race car.
	
	

	public RaceCar(String myName, double myMaxSpeed, double myAcceleration) {
		super();
		this.myName = myName;
		this.myMaxSpeed = myMaxSpeed;
		this.myAcceleration = myAcceleration;
		this.myCurrentSpeed = 0.0;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return myName;
	}
	@Override
	public double getCurrentSpeed() {
		// TODO Auto-generated method stub
		return myCurrentSpeed;
	}
	@Override
	public void resetCurrentSpeed() {
		// TODO Auto-generated method stub
		myCurrentSpeed = 0.0;
	}
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		myCurrentSpeed += myAcceleration;
		if (myCurrentSpeed > myMaxSpeed) {
			myCurrentSpeed = myMaxSpeed;
		}
	}
}
