public class Basic {
  public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setColor("Blue");
    System.out.println("Color of pen is : " + p1.color);
    p1.color = "Red";
    System.out.println("Color of pen is : " + p1.color);

    p1.setTip(5);
    System.out.println("New Tip : " + p1.tip);
  }
}

class Pen {
  String color;
  int tip;

  void setColor(String newColor) {
    color = newColor;
  }

  void setTip(int newTip) {
    tip = newTip;
  }
}
