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

        File file = new File("C:\\Users\\Ankitt\\Desktop\\example45.txt");
        Scanner sc = new Scanner(file);


        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter name of Output File : ");

        String outputfile = s.next();

        FileWriter writer = new FileWriter("C:\\Users\\Ankitt\\Desktop\\"+outputfile);


        try
        {

            while( sc.hasNext() )
            {


                String user = sc.nextLine();

                user = user.replaceAll("utilize", "use");
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

        System.out.println("\nSuccesfully Modified!!");

    }
}
