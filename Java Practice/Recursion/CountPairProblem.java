public class CountPairProblem {
  public static int countPair(int n) {
    if (n == 1)
      return 1;
    if (n == 2)
      return 2;

    int leaveAlone = 1 * countPair(n - 1);
    int pairUp = (n - 1) * countPair(n - 2);

    return leaveAlone + pairUp;
  }

  public static void main(String[] args) {
    int n = 4;
    int pair = countPair(3);
    System.out.println(pair);
  }
}
