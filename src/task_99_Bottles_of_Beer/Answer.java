package task_99_Bottles_of_Beer;

/**
 *  99 bottles of beer on the wall,
 *  99 bottles of beer.
 *  Take one down, pass it around,
 *
 *  98 bottles of beer on the wall,
 *  ...
 *
 *  No more bottles of beer on the wall,
 *  No more bottles of beer.
 *  Go to the store and buy some more,
 *
 *  99 bottles of beer on the wall,
 *  ...
 */

public class Answer {
    public static void main(String[] args) {

        int bottle = 99;
        String[] arrWordBottle = {"bottle", "bottles"};

        while(bottle > 0) {
            if(bottle == 1) {
                System.out.println(bottle + " " + arrWordBottle[0] + " " + "of beer on the wall,");
                System.out.println(bottle + " " + arrWordBottle[0] + " " + "of beer.");
            } else {
                System.out.println(bottle + " " + arrWordBottle[1] + " " + "of beer on the wall,");
                System.out.println(bottle + " " + arrWordBottle[1] + " " + "of beer.");
            }
            System.out.println("Take one down, pass it around," + "\n");
            bottle--;

            if(bottle == 0) {
                System.out.print("No more bottles of beer on the wall," + "\n" +
                                 "No more bottles of beer."  + "\n" +
                                 "Go to the store and buy some more,"  + "\n");
            }
        }
    }
}
