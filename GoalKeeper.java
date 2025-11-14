public class GoalKeeper {
    public static void main(String[] args) {
        // 1. Observe your first array and run the program to see what is stored in goals.
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        System.out.println(goals);
        
        // 2. Modify GoalKeeper to print the highest-scoring game of the season.
        int highestScore = goals[0];
        int highestGame = 0;
        for (int i = 1; i < goals.length; i++) {
            if (goals[i] > highestScore) {
                highestScore = goals[i];
                highestGame = i;
            }
        }
        System.out.println("Highest-scoring game: Game " + (highestGame + 1) + " with " + highestScore + " goals");
        
        // 3. Modify the score for game 3 to indicate that one goal was scored (do not change the initializer list).
        goals[2] = 1; // game 3 is at index 2
        System.out.println("Modified score for game 3: " + goals[2]);
        
        // 4. Comment out the goals declaration line and change the array so it contains only the score of the very first game.
        // CODE TO ADD (comment out the line above and uncomment below):
        // int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        // int[] goals = {1};
    }
}

