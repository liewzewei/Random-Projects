import java.util.Scanner;

public class primeNumberGeneratorOnDemand {
    public static void main(String[] args) {
        Scanner scannerVar = new Scanner(System.in);

        int numberOfPrimeNumbers = 100;
        int[] primeNumberArray = new int [numberOfPrimeNumbers];
        primeNumberArray[0] = 2;

        int numberOfPrimeNumbersInArray;
        int testNumber = 3;
        int tryNumber;

        for(numberOfPrimeNumbersInArray = 1; numberOfPrimeNumbersInArray < numberOfPrimeNumbers;){
            for(tryNumber = 2; tryNumber<=testNumber; tryNumber++){
                if((testNumber%tryNumber) == 0){
                    testNumber++;
                    break;
                }
                else if((testNumber/tryNumber) == 1){
                    primeNumberArray[numberOfPrimeNumbersInArray] = testNumber;
                    numberOfPrimeNumbersInArray++;
                    testNumber++;
                    break;
                }
            }
        }
        System.out.println("Which prime number do you need?");
        int primeNumberNeeded = scannerVar.nextInt();

        System.out.println("Prime number number " + primeNumberNeeded + " is " + primeNumberArray[primeNumberNeeded-1]);
    }
}
