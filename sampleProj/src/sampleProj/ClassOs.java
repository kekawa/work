package sampleProj;

public class ClassOs {

	public static void main(String[] args) {
		Computer myComp = new Computer();
		myComp.installSystem("Windows10","kawa");
		myComp.printDate();
	}
}

class Computer{
	String system = "no";
	String user = "nobody";

	void installSystem(String os,String usr) {
		system = os;
		user = usr;
	}

	void printDate() {
		System.out.println("System:" + system + "\tUserName:" + user );
	}


}
