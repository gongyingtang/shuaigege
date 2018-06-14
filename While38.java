/*
关于while循环的语法；
	while(boolean表达式){
		java语句;
	}
 */
	public class While38{
		public static void main(String[] args){
			//死循环
			/*
				while(true){
					System.out.println("test");
				}
			 */
			/*int i = 0;
			while(i<10){
				i++;
				System.out.println(i);
			}
			*/
			int i =0;
			while(i<=10){
				System.out.println(i);
				i++;
			}
		}
	}