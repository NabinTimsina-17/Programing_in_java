public class SOE {
    public static void main(String args[]) {
        Son s=new Son();
        s.getdata(10, 20);
        s.display();}
}
class Father {
    int a,b;
    void getdata( int p, int y){
        a=p;b=y;
        System.out.println("A"+a+" "+b);
    }}
class Son extends Father{
    int add() {
        int sum=a+b;
        return sum;}
    void display() {
        System.out.println("a"+a);
        System.out.println("a"+b);
        System.out.println(add());
    }}

