package com.example;

import java.util.*;

public class DataStorage {
    // books on my "I need to read these" shelf
    public static void main (String args[]){
        String[] books={"WordPress Theme Development",
                "Web Designers Guide to WordPress",
                "Learning and Cognition: The Design of the Mind",
                "WordPress Design and Development",
                "Tog on Interface",
                "Tog on Software Design",
                "Organizing Solutions for People with Attention Deficit Disorder",
                "Out of the Crisis", "Design and Development Research: Methods, Strategies, and Issues",
                "Introduction to Computing and Programming in Python",
                "Starting out with Python",
                "Qualitative Research"};

        // books with author(s)
        Dictionary references = new Hashtable();
        references.put("WordPress Theme Development", "Brad Williams and David Damstra" );
        references.put("Web Designers Guide to WordPress","Jesse Friedman");
        references.put("Learning and Cognition: The Design of the mind", "Michael E. Martinez");
        references.put("WordPress Design and Development", "Brad Williams and David Damstra");
        references.put("Tog on Interface", "Bruce Tognazzini");
        references.put("Tog on Software Design", "Bruce Tognazzini");
        references.put("Organizing Solutions for People with Attention Deficit Disorder", "Susan C. Pinsky");
        // really should read that one
        references.put("Design and Development Research: Methods, Strategies, and Issues","Rita C. Richey and James D Klein");
        references.put("Introduction to Computing and Programming in Python", "Mark J. Guzdial and Barbara Ericson");
        references.put("Starting out with Python", "Tony Gaddis");
        references.put("Qualitative Research", "Sharan Merriam and Elizabeth Tisdell");



        System.out.println("\n\nThese are the books in my \'I need to read these\' stack: \n\n");
        for (int i = 0; i< books.length; i++){
            System.out.println(books[i]);

        }

        System.out.println("\n\nThis is the book that should be at the top of the list:  ");
        System.out.println("Organizing Solutions for People with Attention Deficit Disorder  \n by:  ");
        System.out.println(references.get("Organizing Solutions for People with Attention Deficit Disorder"));

    }
}
