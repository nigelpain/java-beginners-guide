/*
    Write a program that uses a for loop to generate and display the progression 1, 2, 4, 8, 16, 32 and so on
 */
class TimesTwoCounter {
    public static void main(String[] args) {
        for(int i = 1; i <= 256; i*=2) {
            System.out.print(i + ", ");
        }
    }
}