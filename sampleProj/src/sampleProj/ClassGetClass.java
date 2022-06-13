package sampleProj;

import java.lang.reflect.Method;

public class ClassGetClass {

	public static void main(String[] args) {

	ClassGetClassEmployee e = new ClassGetClassEmployee("Ichiro", "Suzuki");
    Class<? extends ClassGetClassEmployee> c = e.getClass();
    System.out.println("Class name: " + c.getName());
    System.out.println("Methods:");

    	for (Method m : c.getMethods()) {
    		boolean isFirstParam = true;
    		System.out.print(" " + m.getName() + "(");
    		for (Class<?> p : m.getParameterTypes()) {
    			if (!isFirstParam) {
    				System.out.print(",");
    			}
    			System.out.print(p.getName());
    			isFirstParam = false;
    		}
    	System.out.println(")");
    	}
	}
}