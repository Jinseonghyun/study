package mid1.enumeration;

public class EnumRefMain1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService1 discountService = new DiscountService1();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);

    }

}
