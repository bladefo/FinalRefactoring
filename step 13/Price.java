package bad.robot.refactoring.chapter1;

public abstract class Price {
    abstract public int getPriceCode();       


public double getCharge(int daysRented){
    double cost = 0;
    
    switch (getPriceCode()) {
                case Movie.REGULAR:
                    cost += 2;
                    if (daysRented > 2)
                        cost += (daysRented - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    cost += daysRented * 3;
                    break;
                case Movie.CHILDREN:
                    cost += 1.5;
                    if (daysRented > 3)
                        cost += (daysRented - 3) * 1.5;
                    break;
            }
    return cost;
   }
}
