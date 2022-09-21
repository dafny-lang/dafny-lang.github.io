// Class AB_A
// Dafny class AB_A compiled into Java
package _System;

import M_Compile.*;

@SuppressWarnings({"unchecked", "deprecation"})
public class AB_A extends AB {
  public AB_A () {
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (getClass() != other.getClass()) return false;
    AB_A o = (AB_A)other;
    return true;
  }
  @Override
  public int hashCode() {
    long hash = 5381;
    hash = ((hash << 5) + hash) + 0;
    return (int)hash;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("AB.A");
    return s.toString();
  }
}
