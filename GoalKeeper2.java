public class GoalKeeper2 {
    public static void main(String[] args) {
        // Create array for 28 games in a season
        int[] ourGoals = new int[28];
        
        // 6. Review the GoalKeeper2 program and predict what adding the following statement would produce.
        // Then, add the statement to GoalKeeper2 and run to confirm your prediction.
        System.out.println(ourGoals[5]); // goals scored in 6th game
        
        // 7. Add the following code to the GoalKeeper2 program, predict the output, and run it.
        // EXPECT AN ERROR
        // int[] theirGoals;
        // System.out.println(theirGoals);
        
        // 8. Initialize theirGoals using new to create the array. Specify the same number of elements as ourGoals.
        int[] theirGoals = new int[28];
        
        // 9. In game 1, your team scored three goals and their team scored one.
        // Assign these values to the appropriate array elements and show the results of this first game.
        ourGoals[0] = 3; // game 1 is at index 0
        theirGoals[0] = 1;
        System.out.println("Game 1: Our team scored " + ourGoals[0] + " goals, their team scored " + theirGoals[0] + " goals");
    }
}

