public class Basic {
  public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setColor("Blue");
    System.out.println("Color of pen is : " + p1.color);
    p1.color = "Red";
    System.out.println("Color of pen is : " + p1.color);

    p1.setTip(5);
    System.out.println("New Tip : " + p1.tip);

    BankAccount bank = new BankAccount();
    bank.userName = "Abhay Jadhav";
    System.out.println("Name : " + bank.userName);
    bank.setPassword("12234Abh");
    System.out.println("Password : " + bank.password); // It gives error , using function we can only change the value
                                                       // of private variable but we never access it.
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

class BankAccount {
  public String userName;
  private String password;

  public void setPassword(String newPass) {
    password = newPass;
  }
}
