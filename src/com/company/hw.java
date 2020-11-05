package com.company;
import ibadts.IBCollection;
import ibio.Helpers;

public class hw {
    /* outputs John and Marie three times:
    John
    Marie
    John
    Marie
    John
    Marie
    */
    public static void hw1 () {
        IBCollection<String> NAMES = new IBCollection<> ();
        NAMES.add (new String[] {"John", "Marie"});
        for (int i = 0; i <= 2; i++) {
            NAMES.resetNext();
            while (NAMES.hasNext()){
                System.out.println(NAMES.getNext());
            }
        }
    }

    public static void hw2 () {
        IBCollection<Integer> NUMBERS = new IBCollection<Integer> ();
        boolean flag = true;
        int NUMBER;
        int t = 0;
        while (flag) {
            NUMBER = Helpers.inputInt();
            if (NUMBER <= 0)
                flag = false;
            else {
                NUMBERS.addItem(NUMBER);
                t = NUMBER;
            }
        }
        while (NUMBERS.hasNext()){
            NUMBER = NUMBERS.getNext();
            if (NUMBER > t)
                Helpers.output(NUMBER);
        }
    }

    public static void hw3 () {
        IBCollection<Integer> NUMBERS = new IBCollection<Integer> ();
        boolean flag = true;
        int NUMBER;
        while (flag) {
            NUMBER = Helpers.inputInt();
            if (NUMBER <= 0)
                flag = false;
            else
                NUMBERS.addItem(NUMBER);
        }
        if (NUMBERS.hasNext()){
            int index = 0, sum = 0;
            double mean;
            while (NUMBERS.hasNext()) {
                sum = NUMBERS.getNext() + sum;
                index++;
            }
            mean = sum/index;
            NUMBERS.resetNext();
            while (NUMBERS.hasNext()) {
                NUMBER = NUMBERS.getNext();
                if ((NUMBER > (mean * 1.5) || (NUMBER < (mean * 0.5))))
                    Helpers.output(NUMBER);
            }
        }
        else
            Helpers.output("no data");
    }
}
