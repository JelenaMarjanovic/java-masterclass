public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int myFirstNumber = (10 + 5) + (2 * 10);

        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myFourthNumber = myFirstNumber * 2;
        int myTotal2 = myFirstNumber + mySecondNumber + myFourthNumber;

        int myLastOne = 1000 - myTotal2;

        System.out.println("My first number: " + myFirstNumber);

        System.out.println("My total: " + myTotal);

        System.out.println("My total 2: " + myTotal2);

        System.out.println("My last one: " + myLastOne);
    }
}
