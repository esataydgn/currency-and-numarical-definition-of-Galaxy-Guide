package finreach_challenge.galaxy.guide.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import finreach_challenge.galaxy.guide.exception.ValidationException;
import finreach_challenge.galaxy.guide.object.enumtype.RomanNumeralEnum;
import finreach_challenge.galaxy.guide.validation.ValidateCalculaterServiceUtil;


@Service
public class CalculatorService {
	List<String> galaxyNumerals = new ArrayList<String>(
			Arrays.asList("TEGJ", "PISH_TEGJ", "PISH", "GLOB_PISH", "PROK", "GLOB_PROK", "GLOB"));
	List<String> elements = new ArrayList<String>(Arrays.asList("SILVER", "GOLD", "IRON"));
	Map<String, Double> numeralsMap = new HashMap<String, Double>();

	public String calculate(String galaxyNumber) {

		
		
		if(ValidateCalculaterServiceUtil.isInputEmpty(galaxyNumber)) {
			throw new ValidationException("Empty Value asked!!");
		}
		
		putAllDataToMap();
		String[] galaxyNumberArray = galaxyNumber.split(" ");
		String result = calculateTheExpectations(galaxyNumberArray);
		return result;

	}

	private String calculateTheExpectations(String[] galaxyNumberArray) {

		Double exactNumber = 0.0;
		for (int i = 0; i < galaxyNumberArray.length; i++) {
			String numberCombination = "";
			if (isNotTheLastIndex(i, galaxyNumberArray.length)) {
				numberCombination = combineNumbers(i, galaxyNumberArray);
			} else if (elements.contains(galaxyNumberArray[i].toUpperCase())) {
				exactNumber = findElementPrice(galaxyNumberArray[i]) * exactNumber;
				continue;
			}
			if (galaxyNumerals.contains(numberCombination)) {
				exactNumber += findGalaxyNumber(numberCombination);
				i++;
			} else if(isNumberNotNull(galaxyNumberArray[i])) {
				exactNumber += findGalaxyNumber(galaxyNumberArray[i]);
			}
		}
		if(ValidateCalculaterServiceUtil.isResultZero(exactNumber)) {
			return("I have no idea what you are talking about");
		}

		return exactNumber.toString();
	}

	private boolean isNumberNotNull(String number) {
		return findGalaxyNumber(number) != null;
	}

	private Double findGalaxyNumber(String numberCombination) {
		return numeralsMap.get(numberCombination.toUpperCase());
	}

	private Double findElementPrice(String elementName) {
		return numeralsMap.get(elementName.toUpperCase());
	}

	private String combineNumbers(int i, String[] galaxyNumberArray) {
		return (galaxyNumberArray[i] + "_" + galaxyNumberArray[i + 1]).toUpperCase();
	}

	private boolean isNotTheLastIndex(int i, int length) {
		return (i < length - 1);
	}

	private void putAllDataToMap() {
		for (RomanNumeralEnum romanNum : RomanNumeralEnum.values()) {
			numeralsMap.put(romanNum.name(), romanNum.getNumber());
		}
	}

}
