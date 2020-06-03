package cn.tedu.day01;

import java.util.Arrays;

/**
 * 可变参数
 * @author Administrator
 *
 */
public class VariableDemo {
	public static void main(String[] args) {
		VariableDemo demo = new VariableDemo();
		demo.test();
	}
	
	public void test() {
		int[] ary = {1,2,3};
		demo(ary);
	}
	
	public void demo(int...is) {
		System.out.println(is);
		System.out.println(Arrays.toString(is));
		for(int i=0;i<is.length;i++) {
			System.out.println(is[i]);
		}
	}

}
