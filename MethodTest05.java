/*
	如何结束返回值是void的方法
 */
public class MethodTest05{
	public static void main(String[] args){

		m1(0);
		System.out.println("我是中国人");
		if(true){
			return;
		}
		System.out.println("哈哈")；

	}
	public static void m1(int i){
		for(;i<10;i++){

			if(i==5){

				return;//结束方法返回值是void的方法
			//break;
			}
			System.out.println(i);
		}

	}
}