public class BonusMilesService {
  public int calculate(int price) {
        int priceForMile = 20;
        int miles = price / priceForMile;
        return miles;
    }
}
