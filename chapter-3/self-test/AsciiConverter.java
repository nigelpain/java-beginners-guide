/*
    Write a program to convert all ascii lowercase characters to uppercase and vice versa.
    Ignore any character that aren't uppercase or lowercase and display the number of case changes.
 */
class AsciiConverter {
    public static void main(String[] args) throws java.io.IOException {
        char entry;
        int conversions = 0;

        System.out.print("Please enter a sentence for conversion: ");

        do {
            entry = (char) System.in.read();

            if(entry >= 'a' & entry <= 'z') {
                entry -= 32;
                conversions++;
            }
            else if(entry >= 'A' & entry <= 'Z') {
                entry += 32;
                conversions++;
            }

            System.out.print(entry);
        } while(entry != '.');

        System.out.println();
        System.out.println("Number of conversions made: " + conversions);
    }
}