// Class __default
// Dafny class __default compiled into Java
package _System;


@SuppressWarnings({"unchecked", "deprecation"})
public class __default {
  public __default() {
  }
  public static void Main()
  {
    dafny.DafnySequence<? extends Character> _0_who;
    dafny.DafnySequence<? extends Character> _out0;
    _out0 = myjava.C.Who();
    _0_who = _out0;
    java.math.BigInteger _1_version = java.math.BigInteger.ZERO;
    java.math.BigInteger _out1 = java.math.BigInteger.ZERO;
    _out1 = myjava.C.version();
    _1_version = _out1;
    System.out.print((dafny.DafnySequence.<Character>concatenate(dafny.DafnySequence.asString("Hello, "), _0_who)).verbatimString());
    System.out.print((dafny.DafnySequence.asString("!\n")).verbatimString());
    System.out.print((dafny.DafnySequence.asString("Version ")).verbatimString());
    System.out.print(String.valueOf(_1_version));
    System.out.print((dafny.DafnySequence.asString("\n")).verbatimString());
  }
  public static void __Main() {
    __default.Main();
  }
  private static final dafny.TypeDescriptor<__default> _TYPE = dafny.TypeDescriptor.referenceWithInitializer(__default.class, () -> (__default) null);
  public static dafny.TypeDescriptor<__default> _typeDescriptor() {
    return (dafny.TypeDescriptor<__default>) (dafny.TypeDescriptor<?>) _TYPE;
  }
}
