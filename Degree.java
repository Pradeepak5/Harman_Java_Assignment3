package assignment3.com;
import java.util.Scanner;
public class Degree {

	public static void main(String[] args) {
		float Fahrenheit, Celsius;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Fahrenheit :");
        Fahrenheit = s.nextFloat();  
        Celsius  = ((Fahrenheit-32)*5)/9;  
        System.out.println("Temperature in celsius is: "+Celsius);  
	}

}
