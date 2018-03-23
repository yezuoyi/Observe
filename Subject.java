import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject {
	
   private List<Observer> observers = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }
   public List<Observer> getObservers(){
       return this.observers;
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void detach(Observer observer){
       Iterator<Observer> iter = observers.iterator();
       while(iter.hasNext()){
           Observer item = iter.next();
           if(item.equals(observer)){
               iter.remove();
           }
       }

   }
   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}