package udemy.control_flow_statements;

public class EqualityPrinter {
    private static final String INVALID_TEXT = "Invalid Value";
    private static final String EQUAL_TEXT = "All numbers are equal";
    private static final String DIFFERENT_TEXT = "All numbers are different";

    public void printEqual(int a,int b,int c){
        if (a < 0 || b < 0 || c < 0){
            System.out.println(INVALID_TEXT);
        }else if((a == b) && (b == c) && (a == c)){
            System.out.println(EQUAL_TEXT);
        }else if((a != b) && (b != c) && (a != c)){
            System.out.println(DIFFERENT_TEXT);
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}
