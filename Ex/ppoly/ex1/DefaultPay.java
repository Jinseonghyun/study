package ppoly.ex1;

public class DefaultPay implements Pay{

	@Override
	public boolean pay(int amount) {
		System.out.println("���� ������ �����ϴ�.");
		return false;
	}
	
	
}