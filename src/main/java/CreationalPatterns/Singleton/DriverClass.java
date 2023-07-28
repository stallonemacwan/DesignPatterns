package CreationalPatterns.Singleton;

public class DriverClass {

    /**
     * Driver code for checking singleton class
     * @author Stallone Mecwan
     * @param args
     */
    public static void main(String[] args) {
        

        //Fetching singletonclass object by using getSingletonClass method
        SingletonClass singletonClass = SingletonClass.getSingletonClass();

        
        System.out.println(singletonClass.hashCode());
        
    }
    
}
