/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Hamza Iqbal
 */

package Ex45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WordFinder {

    // main method

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Ankit\\Desktop\\example45.txt");
        Scanner sc = new Scanner(file);

        // create another Scanner object to prompt input from user via console

        Scanner s = new Scanner(System.in);

        // prompt the name of Output File from user

        System.out.print("\nEnter the name of Output File : ");

        String outputfile = s.next();

        // create a FileWriter object to write into a file
        // make sure that path of file should be correct

        FileWriter writer = new FileWriter("C:\\Users\\Ankit\\Desktop\\"+outputfile);


        // try and finally block to handle exception

        try
        {

            // using while loop read file

            while( sc.hasNext() )
            {

                // read whole line

                String user = sc.nextLine();

                // replace utilize by use

                user = user.replaceAll("utilize", "use");

                // and write into outputfile

                writer.write(user);

                writer.write("\n");


            }
        }
        finally
        {
            sc.close();
        }

        // and close the writer file

        writer.close();

        System.out.println("\nSuccessfully Modified!!");

    }
}
