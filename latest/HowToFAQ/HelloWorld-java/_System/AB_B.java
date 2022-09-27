// Class AB_B
// Dafny class AB_B compiled into Java
package _System;

import M_Compile.*;

@SuppressWarnings({"unchecked", "deprecation"})
public class AB_B extends AB {
  public AB_B () {
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (getClass() != other.getClass()) return false;
    AB_B o = (AB_B)other;
    return true;
  }
  @Override
  public int hashCode() {
    long hash = 5381;
    hash = ((hash << 5) + hash) + 1;
    return (int)hash;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("AB.B");
    return s.toString();
  }
}
