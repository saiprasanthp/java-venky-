package arrayPractise;

import java.util.ArrayList;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		int[][] k=new int[2][2];
		int[][] jj=new int[2][2];
		jj[0][0]=10;
		jj[0][1]=20;
		jj[1][0]=30;
		jj[1][1]=40;
		for(int i=0;i<jj.length;i++) {
			for(int j=0;j<jj.length;j++) {
				k[i][j]=jj[i][j]; 
			}
		}
		for(int[] l:k) {
			for(int m:l) {
				System.out.println(m);
			}
		}
		String[] s=new String[20];
	String s1="sai";
	s[0]=s1;
	ArrayList<String> al=new ArrayList<String>();
	al.add(s1);
	String[] str=new String[al.size()];
	String l=al.get(0);
	str[0]=l;
	for(String mm:str) {
		System.out.println(mm);
	}
	}
}