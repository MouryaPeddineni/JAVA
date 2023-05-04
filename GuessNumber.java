import java.util.*;

public class GuessNumber {

    public static void main(String[] args) {

        //Creating an object inside Random class.
        Random random = new Random();
        //Scanner class object to take input from user.
        Scanner sc = new Scanner(System.in);

        //Generation of random number between 1 and 100(both inclusive).
        int randomNum = random.nextInt(100) + 1;

        //Initial score of player is 10 and he took 0 chances since he hasn't started playing game.
        int score=10,chances=0;

        while(true){

            System.out.println("Guess the number between 1 and 100 :");

            //Taking guess number input from user.
            int playerGuessNum = sc.nextInt();

            //If player guessed correctly,displaying his/her score and no. of attempts taken.
            if(playerGuessNum==randomNum){
                chances++;
                System.out.println("Woah! You are correct.");
                System.out.println("Your score is " + score + " and you have completed in " + chances + " chances");
                break;
            }

            else if(playerGuessNum > randomNum){

                if(chances<5){
                    chances++;
                    System.out.println("The number you guessed is higher! Please enter lesser number and your remaining chances are "
                            + (5-chances) + "!");
                    score-=2;
                }

                //Maximum chances are 5 for one game.
                if(chances==5){

                    System.out.println("You've ran out of your chances! Your score is " + score + " and correct answer is " + randomNum);

                    System.out.println("Do you want to play again ? Type yes/no.");

                    String str = sc.next();

                    //If a player wants to stop playing,he has to press "no" on the keyboard(non-case sensitive).
                    if(str.equals("no") || str.equals("NO") || str.equals("nO") || str.equals("No")) {
                        break;
                    }

                    //If a player wants to still play the game,he has to press "yes" on the keyboard(non-case sensitive).
                    if(str.equals("yes") || str.equals("YES") || str.equals("yEs") || str.equals("yeS") || str.equals("Yes")
                            || str.equals("YEs") || str.equals("yES") || str.equals("YeS")) {

                        score=10;
                        chances=0;

                    }

                }
            }

            else{

                if(chances<5){

                    chances++;
                    System.out.println("The number you guessed is lower! Please enter higher number and your remaining chances are " +
                            (5-chances) + "!");
                    score-=2;

                }

                //Maximum chances are 5 for one game.
                if(chances==5) {

                    System.out.println("You've ran out of your chances! Your score is " + score + " and correct answer is " + randomNum);

                    System.out.println("Do you want to play again ? Type yes/no.");

                    String str = sc.next();

                    //If a player wants to stop playing,he has to press "no" on the keyboard(non-case sensitive).
                    if(str.equals("no") || str.equals("NO") || str.equals("nO") || str.equals("No")) {
                        break;
                    }

                    //If a player wants to still play the game,he has to press "yes" on the keyboard(non-case sensitive).
                    if(str.equals("yes") || str.equals("YES") || str.equals("yEs") || str.equals("yeS") || str.equals("Yes")
                            || str.equals("YEs") || str.equals("yES") || str.equals("YeS")) {

                        score=10;
                        chances=0;

                    }

                }
            }

        }

    }

}
