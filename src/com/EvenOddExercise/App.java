package com.EvenOddExercise;

public class App {
    public static void main(String[] args) {

        EvenOddMethot();
        EvenSixDotOddFourDots();
        EvenOddOEWeird();

    }

    public static void EvenOddMethot() {
        // Find the way to explain all tha lines in the code
        int k = 5;
        for (int i = 1; i <= 5; i++) { // this loop make the rows
            int lastJCount = 0;
            for (int j = 1; j < k; j++) { // this loops print the *'s
                System.out.print("*");
                lastJCount = j;
            }

            for (int a = lastJCount + 1; a <= 5; a++) { // this loop print the letters
                if (i % 2 == 0) // if it is even
                    System.out.print("E");
                else // if ts is odd
                    System.out.print("O");
            }
            k--;
            System.out.println();
        }

    }
    // ****O
    // ***EE
    // **OOO
    // *EEEE
    // OOOOO

    public static void EvenSixDotOddFourDots() {
        int k = 0;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                k = 4;
            } else {
                k = 6;
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ******
    // ****
    // ******
    // ****
    // ******

    public static void EvenOddOEWeird() {
        // Find the way to explain all tha lines in the code
        int k = 0;//Flag 
        for (int i = 1; i <= 5; i++) { // this loop make the rows
            if (i % 2 == 0) { // see if the roww is even
                for (int j = 0; j < 3; j++) {
                    if (k == 0) {
                        for (int n = 0; n < 2; n++) {
                            System.out.print("*");
                            k = 1;
                        }
                    } else {
                        for (int m = 0; m < 2; m++){
                        System.out.print("E");}
                        k=0;
                    }
                    
                }
            }else{
                for (int j = 0; j < 3; j++) {
                    if (k == 0) {
                        for (int n = 0; n < 2; n++) {
                            System.out.print("O");
                            k = 1;
                        }
                        
                    } else {
                        for (int m = 0; m < 2; m++){
                        System.out.print("*");}
                        k=0;
                    }
                    
                }
            }
            System.out.println();
        }
        
    }

    // OO**OO
    // **EE**
    // OO**OO
    // **EE**
    // OO**OO
}
