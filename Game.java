public class Game{
	public static void main(String[] args){
		int a =(int)10;
		switch(a){
			case a>=90:
			System.out.println("youxiu");
			break;
			case a>=80:case a<90:
			System.out.println("lianghao");
			break;
			case a>=70:case a<80:
			System.out.println("jige");
			break;
			default:
			System.out.println("bujige");
		}
	}
}