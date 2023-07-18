package pak;

import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		Scanner scan=new Scanner(System.in);      
		System.out.println("Enter temp in F");
		double f=scan.nextDouble();
		System.out.println("Temperature in celsius: "+temperatureConverter.convertFahrenheitToCelsius(f));
	    scan.close();
	}

}
