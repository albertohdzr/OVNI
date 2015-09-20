import java.util.Scanner;

public class GravityCalculator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		double gravity = -9.81; //Eath's gravity in m/s**2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		double x = 0.0;
		
		//x(t) = 0.5 * at2 + vit + xi
		System.out.println("Ingresa la Posicion Inicial");
		Scanner user_input = new Scanner (System.in);
			initialPosition = user_input.nextInt();
		System.out.println("Ingresa la Velocidad Inicial");
			initialVelocity = user_input.nextInt();
		
			
		
		finalPosition = 0.5*(Math.pow((gravity*fallingTime), 2)) + (initialVelocity*fallingTime) + initialPosition;
		
			
		
		System.out.println("The object's position after" + fallingTime + " seconds is " + finalPosition + "m.");
	}

}
