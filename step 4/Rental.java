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
    double cost = 0;
    
    switch (movie.getPriceCode()) {
                case Movie.REGULAR:
                    cost += 2;
                    if (this.getDaysRented() > 2)
                        cost += (this.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    cost += this.getDaysRented() * 3;
                    break;
                case Movie.CHILDREN:
                    cost += 1.5;
                    if (this.getDaysRented() > 3)
                        cost += (this.getDaysRented() - 3) * 1.5;
                    break;
            }
    return cost;
   }
}

