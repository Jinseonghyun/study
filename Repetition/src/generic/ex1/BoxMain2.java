package generic.ex1;

public class BoxMain2 {

	public static void main(String[] args) {
		ObjectBox integerBox = new ObjectBox();
		integerBox.setValue(10);
		Integer integer = (Integer) integerBox.getValue();
		System.out.println("integer = " + integer);
		
		ObjectBox stringBoX = new ObjectBox();
		stringBoX.setValue("hello");
		String str = (String) stringBoX.getValue();
		System.out.println("str = " + str);
		
		//잘못된 타입의 인수 전달시
		integerBox.setValue("문자100");
		Integer result = (Integer) integerBox.getValue(); // String -> Integer 캐스팅 예외
		System.out.println("result = " + result);

	}

}
