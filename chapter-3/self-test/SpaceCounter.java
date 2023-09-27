/*
    Write a program that reads characters from the keyboard until a period is received.
    Have the program count the number of spaces. Report the total at the end of the program.
 */
class SpaceCounter {
    public static void main(String[] args) throws java.io.IOException {
        char entry;
        int total = 0;

        System.out.print("Please enter a sentence: ");

        do {
            entry = (char) System.in.read();
            if(entry == ' ') total++;
        } while(entry != '.');

        System.out.println("Number of spaces in sentence was: " + total);
    }
}