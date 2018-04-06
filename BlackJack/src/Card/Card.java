package Card;

public class Card {
	private String number;
	private String pattern;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	@Override
	public String toString() {
		return String.format("Draw Card:[pattern = %s, number = %s]", getPattern(), getNumber());
	}
}


