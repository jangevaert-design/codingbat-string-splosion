public class stringSplosion {
  public String stringSplosion(String str) {
    String outcome = "";

    for (int i = 0; i < str.length() + 1; i++) {
      outcome = outcome + str.substring(0, i);
    }
    return outcome;

  }
}
