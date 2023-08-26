/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiveScoreObserverUsingEvent;

import java.util.EventObject;

/**
 *
 * @author User
 */
public class ScoreEvent  extends EventObject{
    private String someData;
    public String getSomeData(){
        return someData;
    }
    public ScoreEvent(Object o,String value) {
        super(o);
        someData = value;
    }
    
}
