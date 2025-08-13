package skill4;
class FinalDemo {                             
    private final int finalId;                  
    public FinalDemo(int id) {                          
     this.finalId = id;                      
    }
    public final void displayMessage() {        
        System.out.println("This is a final method. It cannot be overridden."); 
    }
    public int getFinalId() {                   
        return finalId;                        
    }
}
class MutableObject {                         
    String name;                              
    MutableObject(String name) {              
        this.name = name;                       
    }
}
public class Final2 {                           
    public static void main(String[] args) {      
     FinalDemo obj = new FinalDemo(101);   
        System.out.println("Final ID: " + obj.getFinalId()); 
        obj.displayMessage();                   
        final MutableObject mo = new MutableObject("Initial Name"); 
        System.out.println("Before change: " + mo.name); 
        mo.name = "Updated Name";             
        System.out.println("After change: " + mo.name); 
    }
}