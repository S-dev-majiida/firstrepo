
public class Learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="my name is xyz";
	String temp="";
		String[] strb=str.split("\\s");
		
		System.out.println(strb[0]);
		System.out.println(strb[1]);
		System.out.println(strb[2]);
		temp=strb[3]+ " "+strb[2]+" "+strb[1]+" "+strb[0];
System.out.println(temp);

	}

}

