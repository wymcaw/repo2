package cn.tedu.day01;

public class Test {
	public static void main(String[] args) {
//		Runnable task = new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("匿名内部类测试");
//			}
//		};
//		
//		task.run();
		
		Foo foo = new Foo() {
			
			@Override
			public void demo() {
				System.out.println("demo方法匿名测试");
			}
		};
		
		foo.demo();
	}

}
