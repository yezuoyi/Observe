public class ObserverPatternDemo {
    public static void main(String[] args) {
       Subject subject = new Subject();
 
       new HexaObserver(subject);
      // OctalObserver octalObserver = new OctalObserver(subject);

       OctalObserver octalObserver = new OctalObserver();
       octalObserver.attach(subject);

       BinaryObserver binaryObserver =new BinaryObserver(subject);
 
       System.out.println("First state change: 15");	
       subject.setState(15);
       System.out.println("Second state change: 10");	
       subject.setState(10);


       subject.detach(binaryObserver);
       octalObserver.detach();
       System.out.println("after delete binaryObserver");	
       System.out.println("First state change: 15");	
       subject.setState(15);
       System.out.println("Second state change: 10");	
       octalObserver.attach(subject);
       subject.setState(10);



    }
 }