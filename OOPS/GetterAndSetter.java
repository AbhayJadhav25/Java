public class GetterAndSetter {
  public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setColor("Blue");
    p1.getColor();
    System.out.println("Pen Colour : " + p1.getColor());

    p1.setTip(5);
    System.out.println("Tip of pen is : " + p1.getTip());

    p1.setBrand("Natraj");
    System.out.println("Pen Brand : " + p1.getBrand());
  }
}

class Pen {
  private String colur;
  private int tip;
  private String brand;

  void setColor(String newColor) {
    this.colur = newColor;
  }

  void setTip(int newTip) {
    this.tip = newTip;
  }

  String getColor() {
    return this.colur;
  }

  int getTip() {
    return this.tip;
  }

  void setBrand(String newBrand) {
    this.brand = newBrand;
  }

  String getBrand() {
    return this.brand;
  }
}