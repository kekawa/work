package sampleProj;

public class ExtendClass {
	public static void main(String[] args) {
		PersonalComputer myComp = new PersonalComputer();
		myComp.installSystem("Windows10","kawakami");
		myComp.cpu = 32;
		myComp.printDate();
		System.out.println("CPU:" + myComp.cpu);
	}
}

// ClassOsのComputerメソッドを継承
class PersonalComputer extends Computer{
	int cpu = 0;
}