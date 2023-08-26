/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiveScoreObserverUsingEvent;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LiveScoreObserverUsingEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource obj = new ScoreSource();
        Subscriber obj1 = new Subscriber();
       Subscriber obj2 = new Subscriber();
       obj.addObserver(obj1);
       obj.addObserver(obj2);
       Scanner inp = new Scanner(System.in);
       String scoreLine;
       System.out.print("Enter Score ");
       scoreLine = inp.nextLine();
       while(!scoreLine.equals("")) {
           obj.setScoreLine(scoreLine);
           System.out.print("Enter Score ");
           scoreLine = inp.nextLine();
       }
    }
    
}
