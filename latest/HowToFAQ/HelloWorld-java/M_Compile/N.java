// Class N
// Dafny class N compiled into Java
package M_Compile;


@SuppressWarnings({"unchecked", "deprecation"})
public class N {
  public N() {
  }
  public static java.math.BigInteger Witness = java.math.BigInteger.valueOf(20L);
  public static java.math.BigInteger defaultValue() {
    return Witness;
  }
  private static final dafny.TypeDescriptor<java.math.BigInteger> _TYPE = dafny.TypeDescriptor.referenceWithInitializer(java.math.BigInteger.class, () -> N.defaultValue());
  public static dafny.TypeDescriptor<java.math.BigInteger> _typeDescriptor() {
    return (dafny.TypeDescriptor<java.math.BigInteger>) (dafny.TypeDescriptor<?>) _TYPE;
  }
}
