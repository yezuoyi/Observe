import java.util.List;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
       this.subject = subject;
       this.subject.attach(this);
    }

    public OctalObserver(){

    }

    public void attach(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
    }

   public void detach(){
     List<Observer> list = this.subject.getObservers();
     for(Observer o : list){
       if(o instanceof OctalObserver && o.equals(this)){
         list.remove(o);
         o =null;
         break;
       }
     }
     System.out.println("after detach OctalObserver");

   }
 
    @Override
    public void update() {
      System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
    }
 }