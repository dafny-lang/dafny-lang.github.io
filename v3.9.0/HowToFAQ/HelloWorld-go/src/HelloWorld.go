// Dafny program HelloWorld.dfy compiled into Go
package main

import (
  _dafny "dafny"
  _System "System_"
)
var _ _dafny.Dummy__
var _ _System.Dummy__

// Definition of class Default__
type Default__ struct {
  dummy byte
}

func New_Default___() *Default__ {
  _this := Default__{}

  return &_this
}

type CompanionStruct_Default___ struct {
}
var Companion_Default___ = CompanionStruct_Default___ {
}

func (_this *Default__) Equals(other *Default__) bool {
  return _this == other
}

func (_this *Default__) EqualsGeneric(x interface{}) bool {
  other, ok := x.(*Default__)
  return ok && _this.Equals(other)
}

func (*Default__) String() string {
  return "_module.Default__"
}
func (_this *Default__) ParentTraits_() []*_dafny.TraitID {
  return [](*_dafny.TraitID){};
}
var _ _dafny.TraitOffspring = &Default__{}
func (_static *CompanionStruct_Default___) Main() {
  _dafny.Print((_dafny.SeqOfString("Hello, world!\n")).SetString())
}
// End of class Default__
func main() {
  defer _dafny.CatchHalt()
  Companion_Default___.Main()
}
