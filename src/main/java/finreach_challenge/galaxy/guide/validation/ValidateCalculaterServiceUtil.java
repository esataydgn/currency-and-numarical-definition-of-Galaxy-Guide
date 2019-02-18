package finreach_challenge.galaxy.guide.validation;

public class ValidateCalculaterServiceUtil {

	public static boolean isInputEmpty(String galaxyNumber) {

		return galaxyNumber.isEmpty();

	}

	public static boolean isResultZero(Double exactNumber) {
		return exactNumber == 0.0;
	}

}
