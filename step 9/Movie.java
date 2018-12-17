package bad.robot.refactoring.chapter1;

public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
    
    public double getCharge(int daysRented){
    double cost = 0;
    
    switch (priceCode) {
                case REGULAR:
                    cost += 2;
                    if (daysRented > 2)
                        cost += (daysRented - 2) * 1.5;
                    break;
                case NEW_RELEASE:
                    cost += daysRented * 3;
                    break;
                case CHILDREN:
                    cost += 1.5;
                    if (daysRented > 3)
                        cost += (daysRented - 3) * 1.5;
                    break;
            }
    return cost;
   }

}
