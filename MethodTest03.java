public class MethodTest03{
	//方法的入口
	public static void main(String[] args){
		m1();//在当前类下，调用方法时可以省略“类名点”
		//m2();m2方法不在当前类，所有调用的时候必须使用类名点的方式
		a.m2();

	}
	public static void m1(){
		System.out.println("m2....");
	}
	
	}
	class a {
		public static void m2(){
			System.out.println("Hello World");
		}
	}
