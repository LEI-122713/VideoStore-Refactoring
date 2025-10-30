package v4;

import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String _name) {
        this._name = _name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        // header
        String result = "Rental Record for " + getName() + "\n";

        for (Rental each : _rentals) {
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getAmount() + "\n";
        }

        // add footer lines (usando as novas queries)
        result += "Amount owed is " + getTotalAmount() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";

        return result;
    }

    private double getTotalAmount() {
        double result = 0;
        for (Rental each : _rentals) {
            result += each.getAmount();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        for (Rental each : _rentals) {
            result += each.getFrequentRentalPoints();
        }
        return result;
    }
}
