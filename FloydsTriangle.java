public class FloydsTriangle {
  public static void triangle(int row) {
    int num = 1;
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    triangle(5);
  }
}
