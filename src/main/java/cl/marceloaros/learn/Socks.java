package cl.marceloaros.learn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Socks {
  public static void main(String[] args) {
    List<Integer> arr = List.of(0, 20, 20, 10, 10, 30, 50, 10, 20);

    System.out.println("sockMerchant(arr.size(), arr) = " + sockMerchant(arr.size(), arr));
  }


  public static int sockMerchant(int n, List<Integer> ar) {
    Map<Integer, Integer> hash = new HashMap<>();

    for (Integer i : ar) {
      if (hash.containsKey(i)) {
        hash.put(i, hash.get(i) + 1);
      } else {
        hash.put(i, 1);
      }
    }
    int pairs = 0;

    for (Integer i : hash.keySet()) {
      pairs += hash.get(i)/2;
    }
    return pairs;
  }
}