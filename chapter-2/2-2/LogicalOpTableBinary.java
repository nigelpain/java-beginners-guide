/*
    Try This 2-2
    A truth table for logical operators
 */
class LogicalOpTableBinary {
    public static void main(String[] args) {
        int p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT\t");

        p = 0b1; q = 0b1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (~p));

        p = 0b1; q = 0b0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (~p));

        p = 0b0; q = 0b1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (~p));

        p = 0b0; q = 0b0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (~p));
    }
}