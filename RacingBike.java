//RacingBike subclass of the superclass Bike

public class RacingBike extends Bike {

//override of superclass' method ride()	
public void ride() {
	System.out.println("This racing bike is fast!");
}
public static void main(String[] args) {
	//creation of polymorphic array
	Bike bike[] = new Bike[4];
	bike[0] = new MountainBike();
	bike[1] = new BMXBike();
	bike[2] = new RacingBike();
	bike[3] = new Bike();
		
	
	//iterate through array print each 
	for(int i=0;i<bike.length;++i) {
		bike[i].ride();
	}
}
}


/*
Output: 

This mountain bike is fast!
This BMX bike is fast!
This racing bike is fast!
This bike is fast!

Use:

Shortcut to calling a subclass of same type without creating a different object for each one
Other way 
SameOutput:

Bike mb = new MountainBike();
mb.ride();
Bike bmx = new BMXBike();
bmx.ride();
Bike rb = new RacingBike();
rb.ride();
Bike b = new Bike();
b.ride();



*/