package bad.robot.refactoring.chapter1;

public class ChildrensPrice extends Price{
    @Override
    public int getPriceCode(){
    return Movie.CHILDREN;
    }
    @Override
    public double getCharge(int daysRented){
        double cost = 1.5;
                    if (daysRented > 3)
                        cost += (daysRented - 3) * 1.5;
        return cost;
    }
}
