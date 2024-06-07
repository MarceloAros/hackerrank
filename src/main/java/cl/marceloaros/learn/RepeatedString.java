package cl.marceloaros.learn;

public class RepeatedString {
  public static void main(String[] args) {
    System.out.println("repeatedString(\"aba\", 10) = " + repeatedString("aba", 10));
  }

  /***
   *
   * @param s: example "aba"
   * @param n: example 10
   * <p>
   *         a b a
   *         | | |
   *         1   1 = 2 = countALetterInS
   * <p>
   *           quotientString   remainingString
   *        ---------^----------  ---^---
   *           1      1      1       1   = 4
   *         --^--  --^--  --^--  ---^---
   *         a b a  a b a  a b a  a  b  a = 3 x "aba"
   *         1 2 3  4 5 6  7 8 9  10    |
   *         |   |  |   |  |   |  |     |
   *         1   2  3   4  5   6  7     x
   *
   * @return long totalCount of "a" in the substring size "n" of infinite repeat "s"
   *
   */
  public static long repeatedString(String s, long n) {
    int countALetterInS = 0;
    long totalCountOfA = 0;

    long quotientString = n / s.length();
    long remainingString = n % s.length();


    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        if (i < remainingString) {
          totalCountOfA++;
        }
        countALetterInS++;
      }
    }

    totalCountOfA += quotientString * countALetterInS;

    return totalCountOfA;
  }
}
