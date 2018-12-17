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

    public String htmlStatement() {
        String result = "<H1>Rental record for <EM>" + getName() + "</EM></H1><P>\n";
        for (Rental rental : rentals) {
            // show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "<BR>\n";
        }

        result += "<P>Amount owed is <EM>" + String.valueOf(getTotal()) + "</EM><P>\n";
        result += "You earned <EM>" + String.valueOf(getPoints()) + "</EM> frequent renter points<P>";

        return result;
    }
}

