package cn.tedu.day01;

public class Basic01 {
	public static void main(String[] args) {
//		int[][] ary = new int[2][3];
//		int[][] ary1 = {{1,2},{1},{1,2,3}};
//		System.out.println(ary1[1][0]);
		
		//+=运算符注意点
//		byte b = 1;
//		byte c = b+1;  //编译报错  原因：byte类型和1（int类型）进行运算，结果是int类型，若想转换为byte，需要强转
		
		
		//char类型和int类型之间的转换
//		char c = 'a';
//		int i = c;  //自动转
		
//		int a = 1;
//		byte b = (byte)a;
		
		
		//char类型和byte之间的转换
		char c ='a';
		byte b = (byte)c;
		
		byte b1 = 1;
		c = (char)b1;
		
		
		
	}

}
