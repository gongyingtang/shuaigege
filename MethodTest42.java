/*
	关于方法的重载（Overload）
	以下程序使用方法的重载，分析优点
		1：程序员只需要记忆少量的方法名，方便调用
		2：代码更加美观
	什么时候会发生方法的重载？
		1：发生在同一个类中
		2：方法名相同
		3：形式参数列表不同（类型、数量、顺序）
		4：和返回值无关（无论返回的是int、long。。。还是void）
		5：和方法的修饰符列表无关（无论是public static还是public）
 */
public class MethodTest42{
	public static void main(String[] args){
		System.out.println(A.sum(10,20));
		System.out.println(A.sum(3.0,2.0));
		System.out.println(A.sum(10l,20l));
	}
}
class A{
	public static int sum(int a,int b){
		return a + b;
	}
	public static double sum(double a,double b){
		return a + b;
	}
	public static long sum(long a,long b){
		return a + b;
	}

}