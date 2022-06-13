package sampleProj;

public class StaticClass {
	public static void main(String args[]) {

		Study_static x = new Study_static();
		x.a = 1;
		x.b = 2;
		Study_static y = new Study_static();
		y.a = 3;
		y.b = 4;

		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(y.a);
		System.out.println(y.b);

		}
}

class Study_static{
	static int a;
	int b;
}
