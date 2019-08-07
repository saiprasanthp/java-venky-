//setters and getters
public class Setters_Getters {
	static {
		System.out.println("this is static block");
	}
	 private String name;
		private String name1;
		public void setName(String name) {
			 this.name=name;	
		}
		public String getName() {
			return name;
		}
		public void setName1(String name1) {
			this.name1=name1;
		}
		public String getName1() {
			return name1;
		}	
	public static void main(String[] args) { 
		Setters_Getters d=new Setters_Getters();
		d.setName("sai");
		d.setName1("ajith");
		System.out.println(d.getName());
		System.out.println(d.getName1());
		StringBuffer sb=new StringBuffer("hai");
		sb.append(" world");
	}

}

