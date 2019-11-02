//Dan Chovanes
//Code provided by Robert Lafore
//I bet I am the only person who cited the author
//I'll double down on my bet and say I am also the only person reading these comments

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        int maxSize = 100;
        ClassDataArray array;
        array = new ClassDataArray(maxSize);
        Scanner sc = new Scanner(new File("roster.txt"));

        while (sc.hasNextLine())
            array.insert(sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.nextLine());
            //Builds the array via the insert method found in ClassDataArray

        Compare(array);

    }
    //end of main
    //------------------------------------------------------------------------------------------------------------------

    public static void Compare(ClassDataArray array) {

        int endKey = 1;

        while (endKey != 0) {

            System.out.println("Please select an option to sort the roster by");
            System.out.println();
            System.out.println("1.) First name\n2.) Last name\n3.) Player number\n4.) Player age\n5.) Player weight\n6.) College attended\n7.) Display unsorted roster\n0.) Exit");
            Scanner temp = new Scanner(System.in);
            int userChoice = temp.nextInt();

            if (userChoice == 1) {
                //First Name, selection sort
                array.SelectionSort(1);
                array.displayArr();
            }
            if (userChoice == 2) {
                //Last Name, selection sort
                array.SelectionSort(2);
                array.displayArr();
            }
            if (userChoice == 3) {
                //Player num, bubble sort
                array.BubbleSort(3);
                array.displayArr();
            }
            if (userChoice == 4) {
                //Player age, bubble sort
                array.BubbleSort(4);
                array.displayArr();
            }
            if (userChoice == 5) {
                //Player weight, bubble sort
                array.BubbleSort(5);
                array.displayArr();
            }
            if (userChoice == 6) {
                //College attended, selection sort
                array.SelectionSort(6);
                array.displayArr();
            }
            if (userChoice == 7) {
                //displays array
                array.displayArr();
            }
            if (userChoice == 0) {
                System.out.println("Exiting, thank you.");
                endKey = 0;
            }
            if (userChoice > 7 || userChoice < 0) {
                System.out.println("You done goofed\nTry again.");
                endKey = 1;
            }

        }
    }
}

