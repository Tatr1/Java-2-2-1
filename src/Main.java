public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int bigprice = service.calculate(20_000);
        System.out.println(bigprice);

        int smallprice = service.calculate(50);
        System.out.println(smallprice);

        int price = service.calculate(6_888);
        System.out.println(price);
    }
}