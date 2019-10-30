package bean.user;

public class Studentx {

	String name,msg;
	public Studentx(String name) {
		this.name = name;
	}
	public void koreaPrint(String name) {
		System.out.println(name+"대한민국 만세");
	}
	public void javaPrint(String name1,String name2) {
		System.out.println(name1+":"+name2+"야 자바만세라고 해라" );
		
	}
	
}
