package bad.robot.refactoring.chapter1;

import java.util.ArrayList;
import java.util.List;

public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
        
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
    
    public double getCharge(){
    return movie.getCharge(daysRented);
   }
    
    public int getRentalPts(){
            // add bonus for a two day new release rental
            if (movie.getPriceCode() == Movie.NEW_RELEASE && daysRented > 1){
                return 2;
            }
        return 1;
    }
}

