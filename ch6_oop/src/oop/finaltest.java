package ch6_oop.src.oop;

//public final class finaltest {}

// class test extends finaltest{
// } 

public class finaltest {
    final int MAX_SIZE = 10;

    final void getMaxSize() {
        // MAX_SIZE = 20;
        final int LV = MAX_SIZE;
        // LV = 20;
    }
}

class test extends finaltest {

}
