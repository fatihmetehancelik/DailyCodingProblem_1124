import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // arrays : [(1, 4), (4, 5), (7, 9), (9, 12)]
        //These given ranges are assumed to be from largest to smallest. Similarly (1,4)
        int[] array = new int[]{1, 4, 4, 5, 7, 9, 9, 12};

        getIntervals(array);


    }

    public static void getIntervals(int[] arr) {
        ArrayList<Integer> arrFirst = new ArrayList<>();
        ArrayList<Integer> arrLast = new ArrayList<>();
        /*While the range is being found, the first elements of the array are put into the list called arrFirst,
        and the second elements are taken into the array called arrLast.*/
        for (int i = 0; i < arr.length; i++) {
            if ((i % 2 == 0)) {
                arrFirst.add(arr[i]);
            } else
                arrLast.add(arr[i]);

        }
    /*
    first elements : 1,4,7,9
    last elements : 4,5,9,12

     The largest of the first elements is the upper limit of the range.
     Similarly , The smallest elements is lower range.


    */

//        System.out.println("First Elements"+arrFirst);
//        System.out.println("Last Elements"+arrLast);

        Collections.sort(arrFirst);
        Collections.sort(arrLast);

        System.out.println("Intervals : Bottom :  " + arrLast.get(0));
        System.out.println("Intervals : Top :  " + arrFirst.get(3));


    }
}
