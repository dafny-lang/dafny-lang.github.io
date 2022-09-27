// Class __default
// Dafny class __default compiled into Java
package _System;

import M_Compile.*;

@SuppressWarnings({"unchecked", "deprecation"})
public class __default {
  public __default() {
  }
  public static void Main()
  {
    System.out.print((dafny.DafnySequence.asString("Hello, world!\n")).verbatimString());
  }
  public static void __Main() {
    __default.Main();
  }
  private static final dafny.TypeDescriptor<__default> _TYPE = dafny.TypeDescriptor.referenceWithInitializer(__default.class, () -> (__default) null);
  public static dafny.TypeDescriptor<__default> _typeDescriptor() {
    return (dafny.TypeDescriptor<__default>) (dafny.TypeDescriptor<?>) _TYPE;
  }
}
