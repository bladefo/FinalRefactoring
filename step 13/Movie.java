package bad.robot.refactoring.chapter1;

public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;
    private Price moviePrice;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return moviePrice.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        switch(priceCode){
            case REGULAR:
            moviePrice = new RegularPrice();
            break;
            case CHILDREN:
            moviePrice = new ChildrensPrice();
            break;
            case NEW_RELEASE:
            moviePrice = new NewReleasePrice();
            break;
        }
    }
    
    public double getCharge(int daysRented){
    /*
    switch (getPriceCode()) {
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
    */
    return moviePrice.getCharge(daysRented);
   }
    
    public int getRentalPts(int daysRented){
            // add bonus for a two day new release rental
            if (getPriceCode() == NEW_RELEASE && daysRented > 1){
                return 2;
            }
        return 1;
    }
}
