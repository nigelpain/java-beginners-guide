/*
    Try This 3-1
    A simple help system
 */
class Help {
    public static void main(String[] args) throws java.io.IOException {
        char option;

        System.out.println("Help on:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.print("Choose one: ");

        option = (char) System.in.read();

        System.out.println("\n");

        switch(option) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("\tcase constant:");
                System.out.println("\t\tstatement sequence;");
                System.out.println("\t\tbreak;");
                System.out.println("\t//...");
                System.out.println("}");
                break;
            default:
                System.out.print("Invalid option selected.");
        }
    }
}