/*
    Write a program that finds all of the prime numbers between 2 and 100
 */
class Prime {
    public static void main(String[] args) {
        int num;

        for (num = 2; num <= 100; num++) {
            int div, count = 0;

            for (div = 1; div <= 100; div++) {
                if (num % div == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(num);
            }
        }
    }
}