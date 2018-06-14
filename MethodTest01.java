/*
	引入方法进行两个整数的求和
 */
public class MethodTest01{
	public static void main(String[] args){
		/*
		int b =20;
		int c =a+b;
		System.out.println(a + "+" + b + "=" + c);
		//以上代码是原始求和方式
		*/
	//在main方法中对sumInt方法进行调用，完成功能
	//注意：所有加有static的方法，调用的时候都必须采取“类名点”的方式进行调用
	MethodTest01.sumInt(10,20);
	MethodTest01.sumInt(20,50);

	}
	//定义方法，完成两个整数的求和
	//注意：目前所有的方法定义为public static
	public static void sumInt(int a,int b){
		int c =a + b;
		System.out.println(a + "+" + b + "=" + c);

	}
}