package fp.laboratorio.test;


public class TestIgualdad {

	public static void main(String[] args) {
		Integer n1 = 205;
		Integer n2 =Integer.valueOf("205");
		Integer n3 = 15;
		Integer n4 = Integer.valueOf("15");
		Integer n5 = 205;
		Integer n6 = 15;
		Integer n7 = n1;
		System.out.println(n1.equals(n2));
		System.out.println(n3.equals(n4));
		System.out.println(n1.equals(n5));
		System.out.println(n3.equals(n6));
		System.out.println(n1 == n2);
		System.out.println(n3 == n4);
		System.out.println(n1 == n5);
		System.out.println(n3 == n6);
		System.out.println(n1 == n7);

	}

}
