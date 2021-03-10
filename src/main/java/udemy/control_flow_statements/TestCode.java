package udemy.control_flow_statements;

public class TestCode {
    public static void main(String[] args) {
        System.out.println(new FlourPack().canPack(1,0,4));
        System.out.println(new FlourPack().canPack(1,0,5));
        System.out.println(new FlourPack().canPack(0,5,4));
        System.out.println(new FlourPack().canPack(2,2,11));
        System.out.println(new FlourPack().canPack(-3,2,12));
        System.out.println(new PerfectNumber().isPerfectNumber(6));
        System.out.println(new PerfectNumber().isPerfectNumber(28));
        System.out.println(new PerfectNumber().isPerfectNumber(5));
        System.out.println(new PerfectNumber().isPerfectNumber(-1));
        new AllFactors().printFactors(6);
        new AllFactors().printFactors(32);
        new AllFactors().printFactors(10);
        new AllFactors().printFactors(-1);
        System.out.println(new GreatestCommonDivisor().getGreatestCommonDivisor(25,15));
        System.out.println(new GreatestCommonDivisor().getGreatestCommonDivisor(12,30));
        System.out.println(new GreatestCommonDivisor().getGreatestCommonDivisor(9,18));
        System.out.println(new GreatestCommonDivisor().getGreatestCommonDivisor(81,153));
        System.out.println(new LastDigitChecker().hasSameLastDigit(41,22,71));
        System.out.println(new LastDigitChecker().hasSameLastDigit(23,32,42));
        System.out.println(new LastDigitChecker().hasSameLastDigit(9,99,999));
        System.out.println(new SharedDigit().hasSharedDigit(12,23));
        System.out.println(new SharedDigit().hasSharedDigit(9,99));
        System.out.println(new SharedDigit().hasSharedDigit(15,55));
        System.out.println(new EvenDigitSum().getEvenSum(252));
        System.out.println(new EvenDigitSum().getEvenSum(-22));
        NumberPalindrome numberPalindrome = new NumberPalindrome();
        System.out.println(numberPalindrome.isPalindrome(-1221));
        System.out.println(numberPalindrome.isPalindrome(707));
        System.out.println(numberPalindrome.isPalindrome(11212));
        System.out.println(new NumberOfDaysInYear().isLeapYear(2000));
        System.out.println(new NumberOfDaysInYear().getDaysInMonth(-2, 2000));
        new DayOfTheWeekChallenge().printDayoftheWeek(0);
        new DayOfTheWeekChallenge().printNumberInWord(0);
        new EqualityPrinter().printEqual(-1,2,3);
        YearsToDays yearsToDays = new YearsToDays();
        yearsToDays.printYearsAndDays(561600);
        System.out.println(new LargestPrime().getLargestPrimeFactor(45));
        new ReadUserInputChallenge().readUserInput();
        new MinAndMaxInputChallenge().getMinMaxValues();
        new InputCalculator().inputThenPrintSumAndAverage();
        System.out.println(new PaintJob().getBucketCount(3.4, 2.1, 1.5,2));
    }
}
