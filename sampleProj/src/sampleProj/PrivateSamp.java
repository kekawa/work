package sampleProj;

public class PrivateSamp {
	public static void main(String[] args) {
		AFinale AA = new AFinale();
		System.out.println(AA.a);
	}
}

class AFinale {
	//private String a = "ABC";
	String a = "ABC";

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
}
