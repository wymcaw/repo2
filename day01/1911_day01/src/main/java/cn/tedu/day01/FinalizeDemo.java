package cn.tedu.day01;

public class FinalizeDemo {
	public static void main(String[] args) {
		Person per = new Person();  //Õ¼ÓÃÄÚ´æ
//		per = null;
		
		System.gc();
		
	}

}
