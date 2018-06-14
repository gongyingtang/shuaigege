/*
	定义方法的语法
		[方法的修饰符列表] 方法的返回值类型 方法名(方法的形式参数){
			java语句;
		}
		1:[方法的修饰符列表]是可选项。现在先暂时写成；public static
		2:方法的返回值类型可以是java语言中任何一种数据类型(基本数据类型和引用数据类型)
		3：方法的形式参数列表，可以有参数，也可以没有参数，如果有多个参数的话使用“，”隔开
 
public static void m1(){
	public static:修饰符
	void 就是这个方法结束时没有返回值
	m1就是方法名
	没有形式参数
	public static int m2(int a,boolean b){
	public static 修饰符
	int 就是返回值类型
	m2 就是方法名
	int a,boolean b 就是形式参数列表
	}

	6：如果一个方法返回值不是void，那么方法就必须使用return语句来返回数据
	return语句一但执行，则方法结束

}
*/
public class MethodTest02{
	public static void main(String[] args){
		MethodTest02.println("Hello World!");
		
	}
	public static void println(String msg){
		System.out.println(msg);
	}
	public static int m3(int a,int b){
		int c = a + b;
		return c;//程序执行到此处m3方法结束，并返回值
		//System.out.println("abc");return语句下不能有其他代码，否则编译都不通过
	}
}