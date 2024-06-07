package cl.marceloaros.learn;

import java.util.List;

public class JumpingOnTheClouds {
  public static void main(String[] args) {
    System.out.println("jumpingOnClouds(List.of(0,0,1,0,0,1,0)) = " + jumpingOnClouds(List.of(0,0,1,0,0,1,0)));
    System.out.println("jumpingOnClouds2(List.of(0,0,1,0,0,1,0)) = " + jumpingOnClouds2(List.of(0,0,1,0,0,1,0)));
  }

  public static int jumpingOnClouds(List<Integer> c) {
    int position = 0;
    int hoops = 0;

    while (position < (c.size() - 1)) {
      if ((position + 2) <= (c.size()-1) && c.get(position+2) == 0) {
        position += 2;
      } else if ((position + 1) <= (c.size()-1) && c.get(position+1) == 0) {
        position = position + 1;
      }
      hoops++;

//      if (position == c.size()-1) {
//        break;
//      }
    }

    return hoops;
  }

  public static int jumpingOnClouds2(List<Integer> c) {
    int hoops = 0;

    for (int position = 0; position < c.size()-1; hoops++) {
      if ((position + 2) <= (c.size()-1) && c.get(position+2) == 0) {
        position += 2;
      } else if ((position+1) <= (c.size()-1) && c.get(position+1) == 0) {
        position += 1;
      }

    }
    return hoops;

  }
}
