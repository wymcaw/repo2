package cn.tedu.day01;

public class Person {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("资源释放工作");
	}

}
