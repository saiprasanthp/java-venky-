//ReturingValues program
public class ReturingValuesProgram {
	public char[] array() {
		char[] c=new char[5];
		c[0]='a';
		c[1]='k';
		c[2]='4';
		c[3]='7';
		c[4]='9';
		return c;
	}
	public void help(char[] h) {
		this.yk(h);
	}
	public void yk(char[] n) {
		for(char k:n) {
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		ReturingValuesProgram d=new ReturingValuesProgram();
		char[] chr=d.array();
		d.help(chr);
	}
}
