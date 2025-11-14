public class DogArray {
    public static void main(String[] args) {
        // 19. Declare (but do not initialize) two arrays, myDogs and neighborsDogs.
        Dog[] myDogs;
        Dog[] neighborsDogs;
        
        // 20. Say you know the names of your three dogs but not the names of your neighbor's two dogs.
        // Initialize each array using the most logical construct; one using an initializer list of known dogs
        // and the other declaring an array of type Dog.
        myDogs = new Dog[]{new Dog("Buddy"), new Dog("Max"), new Dog("Bella")};
        neighborsDogs = new Dog[2];
        
        // 21. Using a few println statements, display the names of all of your dogs.
        // (Use a Dog method to do this; do not modify the Dog class.)
        System.out.println("My dogs:");
        System.out.println(myDogs[0].getName());
        System.out.println(myDogs[1].getName());
        System.out.println(myDogs[2].getName());
        
        // 22. Say your new neighbor comes for a visit and you now know the names of their dogs.
        // Modify your code to define your neighbor's dogs; create the Dog objects, giving them a name,
        // and print them out to confirm their values. Do not change the way the array is declared.
        neighborsDogs[0] = new Dog("Rex");
        neighborsDogs[1] = new Dog("Luna");
        System.out.println("Neighbor's dogs:");
        System.out.println(neighborsDogs[0].getName());
        System.out.println(neighborsDogs[1].getName());
        
        // 23. You also know your friend's dogs. Predict what would happen if you added the following line of code:
        // EXPECT AN ERROR
        // Dog[] friendsDogs = {new Dog("Lady"), new String("Tramp")};
        // System.out.println(friendsDogs[0] + " and " + friendsDogs[1]);
        
        // 24. Change String to Dog and run the program to confirm it is fixed.
        Dog[] friendsDogs = {new Dog("Lady"), new Dog("Tramp")};
        System.out.println("Friend's dogs:");
        System.out.println(friendsDogs[0].getName() + " and " + friendsDogs[1].getName());
        
        // 25. Add the following statement to the end of your DogArray class and observe the error messages.
        // neighborsDogs = {new Dog("Cinnamon"), new Dog("Mocha")}; // error
        // 26. Create a comment describing the error and then comment out the erroneous statement.
        // Error: Array initializer can only be used in a declaration or as part of an array creation expression
        // neighborsDogs = {new Dog("Cinnamon"), new Dog("Mocha")}; // error
        
        // 27. Add the following statement to your DogArray class and observe the error message.
        // neighborsDogs[2] = new Dog("Cocoa"); // error
        // 28. Create a comment describing the error and then comment out the erroneous statement.
        // Error: ArrayIndexOutOfBoundsException - cannot add elements beyond the array's declared size
        // neighborsDogs[2] = new Dog("Cocoa"); // error
        
        // 29. Add the following statements to your DogArray class and observe the error message.
        // neighborsDogs = new Dog[3];
        // System.out.println(neighborsDogs[0].getName()); // error
        // System.out.println(neighborsDogs[1].getName()); // error
        // 30. Create a comment in your code and then comment out the erroneous statement.
        // Error: The original content of the neighborsDogs array was overwritten with the new declaration,
        // and the array is now empty (all elements are null). Trying to call getName() on null causes NullPointerException.
        // neighborsDogs = new Dog[3];
        // System.out.println(neighborsDogs[0].getName()); // error - NullPointerException
        // System.out.println(neighborsDogs[1].getName()); // error - NullPointerException
        
        // 31. To indicate you no longer have a third dog, assign null to the last element of the myDogs array.
        myDogs[2] = null; // gave my puppy to my neighbor!
        System.out.println("After giving away the third dog:");
        System.out.println("My third dog: " + myDogs[2]);
    }
}

