package sampleProj;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassForName {

  public static void main(String[] args) {
    try {
      Class<?> c = null;
      c = Class.forName("sampleProj.ClassGetClassEmployee");
      Constructor constructor = c.getDeclaredConstructor(String.class, String.class);
      ClassGetClassEmployee e = (ClassGetClassEmployee) constructor.newInstance("Ichiro", "Suzuki");
      System.out.println("Last name: " + e.getLastName());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
  }
}