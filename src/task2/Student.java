package task2;

import java.util.Random;

public class Student {
    String name;
    String lastName;
    int result;
    void exam()   {
        Random randomMark = new Random ();
        int maxresult = 5;
        result = randomMark.nextInt(maxresult) +1;
    }
    int getResult () {
        return result;

    }
}
