/*
	深入Methond
 */
public class MethodTest04{
	public static void main(String[] args){
		int i = m1(false);
		System.out.println(i);
		System.out.println(m1(true));

	}
	public static int m1(boolean haha){
		/*if(haha){
			return 0;
		}else{
			return 1;
		}
	}*/
	//方法升级
	if(haha){
		return 0;
	}
	return 1;
}
}