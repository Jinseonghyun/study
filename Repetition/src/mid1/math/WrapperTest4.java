package mid1.math;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        Integer interger1 = Integer.valueOf(str);
        System.out.println(interger1);

        int intValue = interger1;
        System.out.println("intValue = " + intValue);

        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);
    }
}
