package v6;

public class Rental
{
	Movie	_movie;
	private int		_daysRented;

	public Rental(Movie m1, int daysRented)
	{
		_movie = m1;
		_daysRented = daysRented;
	}

	public Movie getMovie()
	{
		return _movie;
	}
	
	public int getDaysRented()
	{
		return _daysRented;
	}

}
