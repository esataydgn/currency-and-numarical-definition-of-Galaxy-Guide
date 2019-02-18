package finreach_challenge.galaxy.guide.object.enumtype;

public enum RomanNumeralEnum {
	GLOB(1.00), GLOB_PROK(4.00), PROK(5.00), GLOB_PISH(9.00), PISH(10.00), PISH_TEGJ(40.00), TEGJ(50.00), SILVER(17.00),
	GOLD(14450.00), IRON(195.5);

	private final Double number;

	RomanNumeralEnum(Double number) {
		this.number = number;
	}

	public Double getNumber() {
		return number;
	}

}
