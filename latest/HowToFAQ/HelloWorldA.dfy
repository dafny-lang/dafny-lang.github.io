method Main() {
  var who: string := myjava.C.Who();
  var version: int := myjava.C.Version();
  print "Hello, " + who, "!\n";
  print "Version ", version, "\n";
}

module {:extern "myjava"} myjava {
class {:extern} C {
  static method {:extern} Who() returns (w: string)
  static method {:extern "version"} Version() returns (n: int)
}
}
