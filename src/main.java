/**
 * Created by danielbuchanan on 1/23/16. this little applet should create an array of 8 with
 * random numbers from 1-100. That array
 *
 */
import java.util.Random;

class main {

    public static void main(String[] args){


        Random random = new Random();
        int randomNumber0 = random.nextInt(100 - 1);
        int randomNumber1 = random.nextInt(100 - 1);
        int randomNumber2 = random.nextInt(100 - 1);
        int randomNumber3 = random.nextInt(100 - 1);
        int randomNumber4 = random.nextInt(100 - 1);
        int randomNumber5 = random.nextInt(100 - 1);
        int randomNumber6 = random.nextInt(100 - 1);
        int randomNumber7 = random.nextInt(100 - 1);
        int randomNumber8 = random.nextInt(100 - 1);
        int randomNumber9 = random.nextInt(100 - 1);

        int[] anArray;

        anArray = new int[10];

        anArray[0] = randomNumber0;
        anArray[1] = randomNumber1;
        anArray[2] = randomNumber2;
        anArray[3] = randomNumber3;
        anArray[4] = randomNumber4;
        anArray[5] = randomNumber5;
        anArray[6] = randomNumber6;
        anArray[7] = randomNumber7;
        anArray[8] = randomNumber8;
        anArray[9] = randomNumber9;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);

    }

}