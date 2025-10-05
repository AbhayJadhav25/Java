public class DiamondPattern {
  public static void pattern(int rows) {
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (i * 2) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = rows; i >= 1; i--) {
      for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (i * 2) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern(5);
  }
}
