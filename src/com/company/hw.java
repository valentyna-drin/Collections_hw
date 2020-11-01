package com.company;
import ibadts.IBCollection;

import java.sql.SQLOutput;

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
}
