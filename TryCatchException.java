public class TryCatchException {
    public static void main(String[] args){
        try{
            int b=30/0;
            int a[]=new int[5];
            String s= null;
            a[10]=40;
            int len= s.length();
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }
        catch (ArrayIndexOutOfBoundsException abe){
            System.out.println(abe);
        }catch (StringIndexOutOfBoundsException sie ){
            System.out.println(sie);
        }catch (Exception e){
            System.out.println("Parent exception");

        }
        System.out.println("rest of the code...");
    }
}
