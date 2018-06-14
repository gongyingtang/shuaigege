public class Game{
	public static void main(String[] args){
		int a = 10;
	    String  s = "幼儿";
	    String  b= "少年";
	    String  c = "青年";
	    String  d = "中年";
	    String  e = "老年";

		if(a>=1 & a<=5 ){
			System.out.println("s");
		}else if(a>=6 & a<=18){
			System.out.println("b");
		}else if(a>=19 & a<=35){
			System.out.println("c");
		}else if(a<=55){
			System.out.println("d");
		}else{
			System.out.println("e");
		}
	}
}