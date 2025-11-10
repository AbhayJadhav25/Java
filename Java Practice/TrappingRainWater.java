public class TrappingRainWater {
  public static void main(String[] args) {
    int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    int n = height.length;

    int lMax[] = new int[n];
    int rMax[] = new int[n];

    lMax[0] = height[0];
    for (int i = 1; i < n; i++) {
      lMax[i] = Math.max(lMax[i - 1], height[i]);
    }

    rMax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rMax[i] = Math.max(rMax[i + 1], height[i]);
    }

    int waterLevel = 0;
    for (int i = 0; i < n; i++) {
      int water = Math.min(lMax[i], rMax[i]) - height[i];

      waterLevel += water;
    }

    System.out.println("Water Level : " + waterLevel);
  }
}
