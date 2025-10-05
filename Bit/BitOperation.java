public class BitOperation {
  public static void getBit(int num, int pos) {
    int BitMask = 1 << pos;
    int bit = BitMask & num;
    if (bit == 0) {
      System.out.println("Bit is zero");
    } else {
      System.out.println("Bit is one");
    }
  }

  public static int setBit(int num, int pos) {
    int bitMask = 1 << pos;
    int setbit = bitMask | num;
    // System.out.println("Number before set the Bit : " + num + "\nNumber After set
    // the bit : " + setbit);
    return setbit;
  }

  public static int clearBit(int num, int pos) {
    int bitMask = ~(1 << pos);
    int res = bitMask & num;
    // System.out.println("Number before set the Bit : " + num + "\nNumber After set
    // the bit : " + res);
    return res;
  }

  public static int updateBit(int num, int pos, int newBit) {
    if (newBit == 0) {
      return clearBit(num, pos);
    } else {
      return setBit(num, pos);
    }
  }

  public static void main(String[] args) {
    int num = 10;
    int pos = 2;
    int newBit = 1;
    // getBit(num, pos);

    // setBit(num, pos);
    // clearBit(num, pos);
    int res = updateBit(num, pos, newBit);
    System.out.println(res);
  }
}
