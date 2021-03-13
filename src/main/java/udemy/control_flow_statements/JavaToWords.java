package udemy.control_flow_statements;

public class JavaToWords {
    private static final String INVALID_TEXT = "Invalid Value";
    public void numberToWords(int num){
        int remainder =  num % 10;
        if (num < 0)System.out.println(INVALID_TEXT);
        while (num > 0){
            switch (remainder){
                case 0:
                    System.out.println(NumberWords.ZERO);
                    break;
                case 1:
                    System.out.println(NumberWords.ONE);
                    break;
                case 2:
                    System.out.println(NumberWords.TWO);
                    break;
                case 3:
                    System.out.println(NumberWords.THREE);
                    break;
                case 4:
                    System.out.println(NumberWords.FOUR);
                    break;
                case 5:
                    System.out.println(NumberWords.FIVE);
                    break;
                case 6:
                    System.out.println(NumberWords.SIX);
                    break;
                case 7:
                    System.out.println(NumberWords.SEVEN);
                    break;
                case 8:
                    System.out.println(NumberWords.EIGHT);
                    break;
                case 9:
                    System.out.println(NumberWords.NINE);
                    break;
            }
            num -= remainder;
        }

    }
}
enum NumberWords{
    ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE
}
