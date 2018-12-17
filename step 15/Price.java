package bad.robot.refactoring.chapter1;

public abstract class Price {
    abstract public int getPriceCode();       

    abstract public double getCharge(int daysRented);
    
    public int getRentalPts(int daysRented){
        return 1;
    }
}
