import java.util.Arrays;
import java.util.Scanner;

public class primeNumberGenerator {
    public static void main(String[] args) {

        Scanner scannerVar = new Scanner(System.in);

        System.out.print("Please enter the number of prime numbers that is needed: ");
        int numberOfPrimeNumbers = scannerVar.nextInt();

        int[] primeNumberArray = new int [numberOfPrimeNumbers];
        primeNumberArray[0] = 2;

        int numberOfPrimeNumbersInArray;
        int testNumber = 3;
        int tryNumber;

        for(numberOfPrimeNumbersInArray = 1; numberOfPrimeNumbersInArray < numberOfPrimeNumbers;){
            for(tryNumber = 2;tryNumber<=testNumber && numberOfPrimeNumbersInArray<numberOfPrimeNumbers;tryNumber++){
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
        System.out.println(Arrays.toString(primeNumberArray));
    }
}
