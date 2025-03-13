public class Main {
  //Static Variable
    public static String name = "John";

     //Instance Variables
    public String names;
    public int age;
    public Main(String names, int age) {
        this.names = names;
        this.age = age;
    }
    public static void main(String[] args) {
      //Local Variable
      String name = "Doe";
      System.out.println(Main.name);  //Static Var
      System.out.println(name);  //Local Var
      Main obj = new Main("Jane", 30); //Instance Var
      System.out.println(obj.age);
    }

}