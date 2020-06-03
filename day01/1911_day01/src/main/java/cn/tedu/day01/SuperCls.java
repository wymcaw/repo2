package cn.tedu.day01;

public class SuperCls {
	int a = 6;
	public SuperCls(){
		test();
	}
	public void test(){
		System.out.println(a);
	}
	public static void main(String[] args){
		new SubCls();
	}
}

class SubCls extends SuperCls{
	int a = 8;
	public SubCls(){
		super();
		test();
	}
	public void test(){
		System.out.println(a);
	}
	
}
