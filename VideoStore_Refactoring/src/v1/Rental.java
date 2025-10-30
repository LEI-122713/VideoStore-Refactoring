package v1;

public class Rental
{
	private Movie	_movie;
	private int		_daysRented;

	public Rental(Movie movie, int daysRented)
	{
		_movie = movie;
		_daysRented = daysRented;
	}

    public double getAmount()
    {
        double result = 0;

        // determine amounts for each line
        switch (this.getMovie().getPriceCode())
        {
            case REGULAR:
                result += 2;
                if (this.getDaysRented() > 2)
                    result += (this.getDaysRented() - 2) * 1.5;
                break;
            case NEW_RELEASE:
                result += this.getDaysRented() * 3;
                break;
            case CHILDRENS:
                result += 1.5;
                if (this.getDaysRented() > 3)
                    result += (this.getDaysRented() - 3) * 1.5;
                break;
        }
        return result;
    }

    public int getDaysRented()
	{
		return _daysRented;
	}

	public Movie getMovie()
	{
		return _movie;
	}
}
