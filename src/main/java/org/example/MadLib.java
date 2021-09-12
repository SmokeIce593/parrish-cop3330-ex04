/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 first_name last_name
 */

package org.example;
import java.util.Scanner;

class MadLib {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print( "Enter a noun:" );
        String noun = input.nextLine();

        System.out.print( "Enter a verb:" );
        String verb = input.nextLine();

        System.out.print( "Enter a adjective:" );
        String adjective = input.nextLine();

        System.out.print( "Enter a adverb:" );
        String adverb = input.nextLine();

        System.out.println( "The " + noun + " and I " + verb + " " + adverb + " to the " + adjective + " park" );

    }
}