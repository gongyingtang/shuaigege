/*
	break语句；
	1；可以用在switch语句中，结束分支语句。
	2:break；语句可以出现在循环中，默认情况下结束离他最近的一个循环。
 */
	public class Break39{
		public static void main(String[]  args){
			for(int i =0;i<10;i++){
                System.out.println(i);
				if(i == 5){
					break; //只是结束离他最近的一个循环
					//return; //结束的main方法
				}
			}

			System.out.println("Hello World!");
		}
	}
	