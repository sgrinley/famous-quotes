package com.pluralsight;

import java.util.Scanner;

public class FamousQuotesApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Create: Array of 10 quotes
        String[] quotes = {
                "The Lord is my shepherd; I shall not want. - Psalm 23:1",
                "I can do all things through Christ who strengthens me. - Philippians 4:13",
                "Trust in the Lord with all your heart. - Proverbs 3:5",
                "Be still, and know that I am God. - Psalm 46:10",
                "For I know the plans I have for you. - Jeremiah 29:11",
                "Walk by faith, not by sight. - 2 Corinthians 5:7",
                "God is our refuge and strength. - Psalm 46:1",
                "Ask and it will be given to you. - Matthew 7:7",
                "Love your neighbor as yourself. - Mark 12:31",
                "The truth will set you free. - John 8:32"
        };

        System.out.print("Pick a number between 1 and 10: ");
        int choice = scanner.nextInt();

//        No error handling yet
//        System.out.println("Quote: " + quotes[choice - 1]);
//        Add exception handling using [try catch error feature
        try {
            System.out.println("Quote: " + quotes[choice - 1]);
        } catch (Exception e) {
            System.out.println("Invalid! Please choose between 1 & 10. ");
        }
        scanner.close(); // good practice
    }
}