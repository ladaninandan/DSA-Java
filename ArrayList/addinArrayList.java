package ArrayList;
// array list in add mathod

import java.util.ArrayList;
import java.util.Collections;

class addinArrayList {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add some data usind .add function 
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get element in array
        int element = list.get(0);
        System.out.println(element);

        // add element in between
        list.add(2, 9);
        System.out.println(list);

        // set element 
        list.set(0, 7);
        System.out.println(list);

        // delete element 
        list.remove(1);
        System.err.println(list);

        // return size in array
        int arraysize = list.size();
        System.out.println(arraysize);

// sort data 
        Collections.sort(list);
        System.out.println(list);

    }
}
