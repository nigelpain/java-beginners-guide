/*
    Try This 5-2
    A queue class for characters
 */
class Queue {
    char[] q;
    int putLoc, getLoc;

    Queue(int size) {
        q = new char[size];
        putLoc = getLoc = 0;
    }

    void put(char ch) {
        if(putLoc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putLoc++] = ch;
    }

    char get() {
        if(getLoc == putLoc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getLoc++];
    }
}

class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        for(i = 0; i < 26; i++) bigQ.put((char) ('A' + i));

        System.out.print("Contents of bigQ: ");
        for(i = 0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Now using smallQ to generate errors.");
        for(i=0; i < 5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        System.out.println("Contents of smallQ: ");
        for(i = 0; i < 5; i++) {
            ch = smallQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
    }
}