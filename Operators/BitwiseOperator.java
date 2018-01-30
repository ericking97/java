/* 
The are six bitwise operators: &, |, ^, ~, <<, >>
Bitwise operator performs bit by bit processing.

num1 = 11 equal to 00001011
num2 = 22 equal to 00010110

num1 & num2 compares corresponding bits of num1 and num2
and generates 1 if both bits are equal, else it returns 0.
In our case it would return 2, which is 00000010 because
is the binary form of num1 and num2.

num1 | num2 compares corresponding bits of num1 and num2
and generates 1 if either bit is 1, else it returns 0.
In our case it would return 31 which is 00011111.

num1 ^ num2 compares corresponding bits of num1 and num2 
and generates 1 if they are not equal, else it returns 0.
In our example it would return 29 which is the equivalent
to 00011101.

~num1 is a complement operator that just changes the bit
from 0 to 1 and 1 to 0.
In our example it would return -12 which is signed 8 bit 
equivalent to 11110100.

num1 << 2 is left shift operator that moves the bits to 
the left, discards the far left bit, and assigns the 
rightmost bit a value of 0. 
In our case output is 44 which is equivalent to 00101100.

num1 >> 2 is right shift operator that moves the bits 
to the right, discards the far right bit, and assigns 
the leftmost bit a value of 0. 
In our case output is 2 which is equivalent to 00000010.

*/
public class BitwiseOperator {
    public static void main(String args []) {

        int num1 = 11;
        int num2 = 22;
        int result = 0;

        result = num1 & num2;
        System.out.println("num1 & num2: " + result);

        result = num1 | num2;
        System.out.println("num1 | num2: " + result);

        result = num1 ^ num2;
        System.out.println("num1 ^ num2: " + result);

        result = ~num1;
        System.out.println("~num1: " + result);

        result = num1 << 2;
        System.out.println("num1 << 2: " + result);

        result = num1 >> 2;
        System.out.println("num1 >> 2: " + result);

    }
}