/*
	continue;
 */
	public class Continue39{
		
		public static void main(String[] args){
		
			for(int i =0;i<10;i++){
		
				if(i==5){
                 //continue语句可以用来结束当前本一次循环，直接进入下一次循环继续执行
                 continue;
				}
				System.out.println(i);
			}
			/*
				//通过以下程序可以看出，break可以结束指定某个程序
				outFor:for(int i=5;i>0;i--){
					for(int j=0;j<i;j++){
						if(j==2){
						break outFor;
						}
						System.out.print(j);
					}
					System.out.println();
				}
			 */

		}
	}