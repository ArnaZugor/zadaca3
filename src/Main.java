import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //Task 5

        System.out.println("Please enter lower number in range: ");
        int lowerValue = reader.nextInt();

        System.out.println("Please enter higher number in range: ");
        int higherValue = reader.nextInt();

        for (int i=lowerValue+1; i<higherValue; i++) {
           if (i%2 ==0){
               System.out.println("Even numbers for range: " +lowerValue + " to " +higherValue + ": " +i);
           }


        // Task 3

        int[] array = {1,2,3,4,5,6,7};
        int[] reversedArray = new int[array.length];

        for(int i=array.length-1; i>=0; i--){
            reversedArray[i] = array[i];
            System.out.println(reversedArray[i]);

        }


        // Task 6

           int[] firstArray = {1,3,5};
           int[] secondArray = {11,13,15};
           int[] thirdArray = {21,33,55};
           int[] threeInOneArray = new int [firstArray.length + secondArray.length + thirdArray.length];

           int index = 0;

           for(int i=0; i< firstArray.length; i++){
               threeInOneArray[index++] = firstArray[i];
           }
           for(int i=0; i< secondArray.length; i++){
               threeInOneArray[index++] = secondArray[i];
           }
           for(int i=0; i< thirdArray.length; i++) {
               threeInOneArray[index++] = thirdArray[i];
           }
          System.out.println(Arrays.toString(threeInOneArray));


        // Task 9

           int[] arrayOne = {1,2,3};
           int[] arrayTwo = {7,8,9};

           int sum =0;

           for (int i=0; i<=arrayOne.length-1; i++) {
               for (int j=0; j <=arrayTwo.length-1; j++) {
                   sum = sum + arrayOne[i] + arrayTwo[j];
               }
           }
        System.out.println(sum);


        // Task 7

        int[] biggerArray = {4, 2, 8, 3, 3, 10};
        int[] smallerArray = {1, 2, 1};


        for (int i = 0; i < smallerArray.length; i++) {
            biggerArray[i] = biggerArray[i] + smallerArray[i];

            System.out.println(Arrays.toString(biggerArray));
        }

       // Task 2

       int[] arrayToPrint = {50,100,150,200,250,300,350,400,450,500};
       String[] positionInArray = {"First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth","Ninth","Tenth","Eleventh","Twelfth","Thirteenth","Fourteenth","Fifteenth"};

       if (arrayToPrint.length<=15) {
           for (int i = 0; i < arrayToPrint.length; i++) {
               System.out.println(positionInArray[i] + " number in array: " + arrayToPrint[i]);
           }
       } else {
               System.out.println("The array has more than 15 elements.");
          }


        //Task 1

        System.out.println("Enter the size of the array: ");

        int arraySize = reader.nextInt();
        int[] numbersInArray = new int[arraySize];

        for (int i=0; i< arraySize; i++){
            System.out.println("Enter a number for position "+ i +": ");
            numbersInArray[i] = reader.nextInt();
        }
        System.out.println("The numbers in the array are: ");
        for (int i=arraySize-1; i>=0; i--){
            if(numbersInArray[i] % 2 ==0){
                System.out.println(numbersInArray[i] + " is an even number");
            }else{
                System.out.println(numbersInArray[i] + " is an odd number");
            }
        }


        //Task 4

        System.out.println("Enter word to check if it is a palindrome: ");
        String wordToCheck = reader.nextLine();
        char[]wordToCheckConverted = wordToCheck.toCharArray();

        for (int i=0; i< wordToCheckConverted.length/2; i++){
            if (wordToCheckConverted[i] != wordToCheckConverted[wordToCheckConverted.length -1 -i]){
                System.out.println("The word " +wordToCheck +" is not a palindrome");
                break;
            }else{
                System.out.println("The word " +wordToCheck +" is a palindrome");

            }
        }


        //Task 8

        String[] wordsToCheck = {"sky","grass","Ann","Egg","Un","towel","image"};
        String[] vowels = {"A","a","E","e","I","i","O","o","U","u"};

        for (int i=0; i< wordsToCheck.length; i++){
            boolean containsVowel = false;
            for (int j=0; j< vowels.length; j++){
                if (wordsToCheck[i].contains(vowels[j])){
                    containsVowel = true;
                    break;
                }
            }
            if (!containsVowel){
                System.out.println(wordsToCheck[i] + " ");
            }

        }

    }

    }
