public class Main{
  public static void main(String[] arg){
    System.out.print("Hello World");
    String string = new String(new char[10]).replace('\0', '*');
    System.out.println(string);
  }
}
