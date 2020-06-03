package cn.tedu.day01;

public class LambdaDemo {
	public static void main(String[] args) {
//		Foo foo = new Foo() {
//			@Override
//			public void demo() {
//				System.out.println("demo方法匿名测试");
//			}
//		};
//
//		foo.demo();

		// 使用lambda表达式实现Foo接口
		Foo foo1 = ()->System.out.println("lambda表达式测试01");
		foo1.demo();
	}

}
