/*
    Try This 10-2
    A help program that uses a disk file to store help information.
 */

import java.io.*;

class Help {
    String helpfile;

    Help(String filename) {
        helpfile = filename;
    }

    boolean helpOn(String what) {
        int ch;
        String topic, info;

        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
            do {
                ch = helpRdr.read();

                if(ch == '#') {
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0) {
                        do {
                            info = helpRdr.readLine();
                            if(info != null) System.out.println(info);
                        } while((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while(ch != -1);
        } catch(IOException exc) {
            System.out.println("Error accessing help file.");
            return false;
        }
        return false;
    }

    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        System.out.print("Enter topic: ");
        try {
            topic = br.readLine();
        } catch(IOException exc) {
            System.out.println("Error reading console.");
        }
        return topic;
    }
}

class FileHelp {
    public static void main(String[] args) {
        Help helpobj = new Help("helpfile.txt");
        String topic;

        do {
            topic = helpobj.getSelection();

            if(!helpobj.helpOn(topic))
                System.out.println("Topic not found.\n");
        } while(topic.compareTo("stop") != 0);
    }
}