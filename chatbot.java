// Imports
import java.awt.*;
import java.io.*;
import java.io.IOException;
import java.awt.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class chatbot {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String timeStamp = new SimpleDateFormat("dd:MM:yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("Hello there! I'm your Personal ChatBot");

        boolean running = true;
        while (running == true) {
            System.out.println();
            String input = sc.nextLine();
            input = input.toLowerCase();

            if (input.equals("hello")) {
                System.out.println("Hello there!");
            } else if (input.equals("open app")) {
                File file = new File("C:\\Program Files\\Git\\git-bash.exe");
                Desktop.getDesktop().open(file);
                System.out.println("here you go");
            } else if (input.equals("what is your name?")) {
                System.out.println("Hey there! I'm your personal ChatBot.");
            } else if (input.equals("bye")) {
                System.out.println("Bye");
                running = false;
            } else if (input.equals("what is the date and time?")) {
                System.out.println("dd:mm:yyyy hh:mm:ss");
                System.out.println(timeStamp);
            } else {
                System.out.println("Sorry I don't understand");
            }
        }
    }
}