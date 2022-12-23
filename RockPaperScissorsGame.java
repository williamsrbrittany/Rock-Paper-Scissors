package rockpaperscissorsgame;

import java.util.Scanner;
/**
 *
 * @author Britt
 */
public class RockPaperScissorsGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] computerHandArray = {"R", "P", "S"};
        String computerHand = "";
        String thisWinner ="";
        String theFinalWinner ="";
        int index=0;
        int timesIWon=0;
        int timesComputerWon=0;
        Scanner in = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            String myHandString= in.nextLine();
            String myHand = myHandString.substring(0, 1);
            myHand = myHand.toUpperCase();
            index = (int)(Math.random() * 10)% 3;
            computerHand = computerHandArray[index];
            thisWinner = theWinnerOfOneGame(myHand, computerHand);
            
            if(thisWinner.equals("ME")){
                timesIWon++;
            }
            
            else if (thisWinner.equals("COMPUTER")){
                    timesComputerWon++;
        }
    }
        if(timesIWon == timesComputerWon)
            theFinalWinner = "TIE";
        else if(timesIWon > timesComputerWon)
            theFinalWinner = "ME";
        else if(timesComputerWon > timesIWon)
            theFinalWinner = "COMPUTER";
        
        System.out.println("I won: " + timesIWon);
        System.out.println("Computer won: " + timesComputerWon);
        System.out.println("The Final Winner after the 5 games is:" + theFinalWinner);
}
    private static String theWinnerOfOneGame(String myHand, String computerHand){
        String theWinner = "TIE";        
        
        if(myHand.equals(computerHand))
            theWinner = "TIE";
        else if(myHand.equals("R")){
            if(computerHand.equals("P")){
                theWinner = "COMPUTER";
            }
            else if(computerHand.equals("S")){
                theWinner = "ME";
            }
        }
        else if(myHand.equals("P")){
            if(computerHand.equals("R")){
                theWinner = "ME";
            }
            else if(computerHand.equals("S")){
                theWinner = "COMPUTER";
            }
        }
        else if(myHand.equals("S")){
            if(computerHand.equals("R")){
                theWinner = "COMPUTER";
            }
            else if(computerHand.equals("P")){
                theWinner = "ME";
            }
        }
        
        return theWinner;
        
    }
    
}
