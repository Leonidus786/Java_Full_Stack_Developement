public class Main {
  int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 50; // x is now 25
    System.out.println(myObj.x);
  }
}