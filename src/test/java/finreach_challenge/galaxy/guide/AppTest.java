package finreach_challenge.galaxy.guide;

import org.junit.jupiter.api.Test;

import finreach_challenge.galaxy.guide.service.CalculatorService;
import junit.framework.TestCase;

public class AppTest extends TestCase {

	CalculatorService calculatorService = new CalculatorService();

	@Test
	public void test_pish_tegj_glob_glob() {
		String result = calculatorService.calculate("pish tegj glob glob");
		assertEquals(result, "42.0");
	}

	@Test
	public void test_credits_of_glob_prok_silver() {
		String result = calculatorService.calculate("glob prok Silver");
		assertEquals(result, "68.0");
	}

	@Test
	public void test_glob_prok_gold() {
		String result = calculatorService.calculate("glob prok Gold");
		assertEquals(result, "57800.0");
	}

	@Test
	public void test_glob_prok_iron() {
		String result = calculatorService.calculate("glob prok Iron");
		assertEquals(result, "782.0");
	}

	@Test
	public void test_invalid_data() {
		String result = calculatorService
				.calculate("how much wood could a woodchuck chuck if a woodchuck could chuck wood ");
		assertEquals(result, "I have no idea what you are talking about");
	}

}
