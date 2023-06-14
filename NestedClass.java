class NestedClass{
    private int data=30;
    class Inner{
        void msg(){
      System.out.println("data is "+data);
        }
    }
    public static void main(String[] args){
        NestedClass obj = new NestedClass();
        NestedClass.Inner in = obj.new Inner();
        in.msg();
    }
}