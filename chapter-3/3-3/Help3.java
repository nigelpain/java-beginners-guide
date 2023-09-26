/*
    Try This 3-3
    An improved help system that uses a
    do-while to process a menu selection
 */
class Help3 {
    public static void main(String[] args) throws java.io.IOException {
        char option, ignore;

        for( ; ; ) {
            do {
                System.out.println("Help on: ");
                System.out.println("\t1. if");
                System.out.println("\t2. switch");
                System.out.println("\t3. for");
                System.out.println("\t4. while");
                System.out.println("\t5. do-while");
                System.out.println("\t6. break");
                System.out.println("\t7. continue\n");
                System.out.print("Choose one (q to quit): ");

                option = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while(option < '1' | option > '7' & option != 'q');

            if(option == 'q') break;

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
                case '3':
                    System.out.println("The for:\n");
                    System.out.println("for(initialisation; condition; iteration)");
                    System.out.println("\t statement;");
                    break;
                case '4':
                    System.out.println("The while:\n");
                    System.out.println("while(condition) statement;");
                    break;
                case '5':
                    System.out.println("The do-while:\n");
                    System.out.println("do {");
                    System.out.println("\tstatement;");
                    System.out.println("} while(condition);");
                    break;
                case '6':
                    System.out.println("The break:\n");
                    System.out.println("break; or break label;");
                    break;
                case '7':
                    System.out.println("The continue:\n");
                    System.out.println("continue; or continue label;");
                    break;

            }
        }
    }
}