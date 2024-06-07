package cl.marceloaros.learn;

public class CountingValleys {
  public static void main(String[] args) {
    System.out.println("countingValleys(8, \"UDDDUDUU\") = " + countingValleys(8, "UDDDUDUU"));
  }

  public static int countingValleys(int steps, String path) {
    int totalValleys = 0;
    int altitude = 0;

    for (int i = 0; i < path.length(); i++) {
      if (path.charAt(i) == 'U') {
        altitude++;
        if(altitude == 0) {
          totalValleys++;
        }
      } else if (path.charAt(i) == 'D') {
        altitude--;
      }
    }
    return totalValleys;
  }
}
