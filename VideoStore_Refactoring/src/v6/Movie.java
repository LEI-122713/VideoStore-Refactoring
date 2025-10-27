package v6;

public class Movie {

	public double getRentalAmount(int rental)
	{
		double result = 0;

		switch (_priceCode)
		{
			case REGULAR:
				result += 2;
				if (rental > 2)
					result += (rental - 2) * 1.5;
				break;
			case NEW_RELEASE:
				result += rental * 3;
				break;
			case CHILDRENS:
				result += 1.5;
				if (rental > 3)
					result += (rental - 3) * 1.5;
				break;
		}
		return result;
	}

	public int getFrequentRentalPoints(int rental)
	{
		return (_priceCode == Code.NEW_RELEASE) && rental > 1 ? 2 : 1;
	}

	public enum Code {REGULAR, CHILDRENS, NEW_RELEASE};
	
	private String _title;
	private Code _priceCode;
	
	public Movie(String title, Code priceCode) {
		_title = title;
		_priceCode = priceCode;
	}

	public String getTitle() {
		return _title;
	}

	public Code getPriceCode() {
		return _priceCode;
	}
}
