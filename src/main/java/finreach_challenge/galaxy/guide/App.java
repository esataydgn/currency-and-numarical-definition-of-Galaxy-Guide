package finreach_challenge.galaxy.guide;

import finreach_challenge.galaxy.guide.service.CalculatorService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorService();
		System.out.println("pish tegj glob glob is " + calculatorService.calculate("pish tegj glob glob") + "Credits");
		System.out.println("glob prok Silver is" + calculatorService.calculate("glob prok Silver") + "Credits");
		System.out.println("glob prok Gold is " + calculatorService.calculate("glob prok Gold") + "Credits");
		System.out.println("glob prok Iron is " + calculatorService.calculate("glob prok Iron") + "Credits");
		System.out.println("how much wood could a woodchuck chuck if a woodchuck could chuck wood ? ==" + calculatorService.calculate("how much wood could a woodchuck chuck if a woodchuck could chuck wood ?"));
		

	}
}
