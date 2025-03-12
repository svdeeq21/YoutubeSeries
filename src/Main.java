public class Main {
    public static String name = "John";
    public String names;
    public int age;
    public Main(String names, int age) {
        this.names = names;
        this.age = age;
    }
    public static void main(String[] args) {
      String name = "Doe";
      System.out.println(name);  
      System.out.println(Main.name);
      Main obj = new Main("Jane", 30);
      System.out.println(obj.age);
    }

}