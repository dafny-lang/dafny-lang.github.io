package myjava;

public class C {
  static public java.math.BigInteger version() { return java.math.BigInteger.valueOf(42); }
  static public dafny.DafnySequence Who() { return dafny.DafnySequence.<Character>asString("You"); }
}
