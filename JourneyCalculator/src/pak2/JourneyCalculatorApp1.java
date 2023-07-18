package pak2;

import java.util.Scanner;

public class JourneyCalculatorApp1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator j=new JourneyCalculator();
		System.out.printf("%.2f",j.calculateDistance(speed,time));
		
		scan.close();
}

}
