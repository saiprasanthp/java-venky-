//example on all exercise
class Devops{
	public void start() {
		System.out.println("parent class");
	}	
}class Java extends Devops{
	public void start() {
		System.out.println("child class");
	}	
}
class Oracle{
	Java l;
	Oracle(Java l){
		this.l=l;	
	}
public void getting() {
	l.start();
	this.tex();
	System.out.println(tex());
}
public String tex(){
	return "returing string in tex method";
}
public boolean jeep() {
	return true;
}
public void get(Boolean  b) {
	this.bet(b);
}
public void bet(Boolean b) {
	System.out.println("hai");
}
}
public class NormalExample {
	public static void main(String[] args) {
		Java f=new Java();
		Oracle d=new Oracle(f);
		d.getting();
		boolean flag=d.jeep();
		System.out.println(flag);
		if(flag) {
			d.get(flag);	
		}else {
			System.out.println("j");
		}
		
	}
}
