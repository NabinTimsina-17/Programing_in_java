public class NestedTryCatch {
    public static void main(String[] args){
        try{
                try{
                int b=30/0;
                } catch (ArithmeticException ae) {
                    System.out.println(ae);
                }
                try{
                    int a[]=new int[5];
                    a[10]=40;
                }catch (ArrayIndexOutOfBoundsException abe){
                    System.out.println(abe);
                }
                try{
                    String s= null;
                    int len= s.length();
                }catch (StringIndexOutOfBoundsException sie ){
                    System.out.println(sie);
                }
        }catch (Exception e){
            System.out.println("Parent exception");
        }finally{
            System.out.println("Finally is always executed.");
        }
        System.out.println("rest of the code...");
        }
    }
