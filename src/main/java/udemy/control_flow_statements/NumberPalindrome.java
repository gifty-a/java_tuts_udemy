package udemy.control_flow_statements;

public class NumberPalindrome {
    public boolean isPalindrome(int number){
        if (number < 0){
            number *= -1;
        }
        int reverse = 0;
        int storedNumber = number;
        while (storedNumber > 0){
            int lastDigit = storedNumber % 10;
            reverse = reverse * 10 + lastDigit;
            storedNumber /= 10;
        }
        return number == reverse ? true : false;
//        return true;
    }
}
