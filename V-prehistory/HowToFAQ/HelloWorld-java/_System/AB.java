// Class AB
// Dafny class AB compiled into Java
package _System;

import M_Compile.*;

@SuppressWarnings({"unchecked", "deprecation"})
public abstract class AB {
  public AB() { }

  private static final AB theDefault = _System.AB.create_A();
  public static AB Default() {
    return theDefault;
  }
  private static final dafny.TypeDescriptor<AB> _TYPE = dafny.TypeDescriptor.referenceWithInitializer(AB.class, () -> Default());
  public static dafny.TypeDescriptor<AB> _typeDescriptor() {
    return (dafny.TypeDescriptor<AB>) (dafny.TypeDescriptor<?>) _TYPE;
  }
  public static AB create_A() {
    return new AB_A();
  }
  public static AB create_B() {
    return new AB_B();
  }
  public boolean is_A() { return this instanceof AB_A; }
  public boolean is_B() { return this instanceof AB_B; }
  public static java.util.ArrayList<AB> AllSingletonConstructors() {
    java.util.ArrayList<AB> singleton_iterator = new java.util.ArrayList<>();
    singleton_iterator.add(new AB_A());
    singleton_iterator.add(new AB_B());
    return singleton_iterator;
  }
}
