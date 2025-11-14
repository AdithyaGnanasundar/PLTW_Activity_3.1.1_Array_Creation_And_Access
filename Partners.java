public class Partners {
    public static void main(String[] args) {
        // 10. Observe the declaration for days.
        String[] days;
        
        // 11. Initialize days with an initializer list of Strings that contains values for each day of the week.
        days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        // 12. Create another String array called partners and initialize it with the new keyword to have seven elements.
        String[] partners = new String[7];
        
        // 13. Add code to print one partner element so you can see the initial value of a String element.
        System.out.println(partners[0]); // Should print null
        
        // 14. Using the index values for the three days of the week you have practice,
        // assign a unique made-up name for your partner for each day.
        // Monday (index 1), Wednesday (index 3), Friday (index 5)
        partners[1] = "Alice"; // Monday
        partners[3] = "Bob";   // Wednesday
        partners[5] = "Charlie"; // Friday
        
        // 15. In three println statements, show the days of the week you have practice
        // using the days array and your partner for that day using the partners array.
        System.out.println(days[1] + ": " + partners[1]);
        System.out.println(days[3] + ": " + partners[3]);
        System.out.println(days[5] + ": " + partners[5]);
        
        // 16. During one week of practice, your coach organizes a round-robin group of three practices,
        // and you get to invite a friend to play with you. Create a copy of an object reference.
        String[] friendPartners = partners;
        
        // 17. You and your friend should have the same partners. Using the same indices as before,
        // print your friendPartners array.
        System.out.println("Friend's partners:");
        System.out.println(days[1] + ": " + friendPartners[1]);
        System.out.println(days[3] + ": " + friendPartners[3]);
        System.out.println(days[5] + ": " + friendPartners[5]);
        
        // 18. Finally, you have a change in partners. Change the name(s) using only the partners array reference,
        // and confirm the change was seen by friendPartners.
        partners[1] = "David"; // Change Monday's partner
        System.out.println("After change:");
        System.out.println("My partner on " + days[1] + ": " + partners[1]);
        System.out.println("Friend's partner on " + days[1] + ": " + friendPartners[1]);
    }
}

