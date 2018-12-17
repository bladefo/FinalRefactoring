package bad.robot.refactoring.chapter1;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {

        String result = "Rental record for " + getName() + "\n";
        for (Rental rental : rentals) {
            // show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(getTotal()) + "\n";
        result += "You earned " + String.valueOf(getPoints()) + " frequent renter points";

        return result;
    }
    
    /*
    private double getAmount(final Rental rental ){
        return rental.getCharge();
    }
      */
    
    private double getTotal(){
        double totalAmount = 0;
        for (Rental rental : rentals) {

            totalAmount += rental.getCharge();
            
        }
        return totalAmount;
    }
    
    private int getPoints(){
        int points = 0;
        for (Rental rental : rentals) {
            
            points += rental.getRentalPts();

        }
        return points;
    }

    
}

