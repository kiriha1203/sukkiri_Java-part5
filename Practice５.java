import sun.jvm.hotspot.ui.table.SortHeaderMouseAdapter;

public class Practice５ {
  public static void main(String[] args) {
    introduceOneself();
    String address = "asdasd";
    String title = "sadasdas";
    String text = "sdasfsafsas";
    email(title, address, text);
    double bottom = 10.0;
    double height = 5.0;
    double radius = 5.0;
    double traiangleArea = calcTriangleArea(bottom, height);
    System.out.println("三角形の面積は" + traiangleArea);
    double circleArea = calcCircleArea(radius);
    System.out.println("円の面積は" + circleArea);
  }

  public static void introduceOneself() {
    String name = "name";
    int age = 20;
    double height = 160.0;
    char eto = '申';
    System.out.println("私は" + name + "年齢は" + age + "身長は" + height + "干支は" + eto + "です");
  }

  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名:" + title);
    System.out.println("本文:" + text);
  }

  public static void email(String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名: 無題");
    System.out.println("本文:" + text);
  }

  public static double calcTriangleArea(double bottom, double height) {
    double area = bottom * height / 2;
    return area;
    }

  public static double calcCircleArea(double radius) {
    double area = radius * radius * 3.14;
    return area;
  }
  
}