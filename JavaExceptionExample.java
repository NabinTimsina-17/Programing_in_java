public class JavaExceptionExample {
    public static void main(String[] args) {
        try{int a= 100/0;}
catch(ArithmeticException exception){
            System.out.println(exception);
}
}

}