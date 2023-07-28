package CreationalPatterns.Singleton;


/**
 * @author Stallone Mecwan
 * Singleton class having private constructor, hence restricting the use of this class to single instance
 */
public class SingletonClass {

    private static SingletonClass singletonClass;
    

    /**
     * Private constructor
     */
    private SingletonClass(){

    }

    /**
     * Helper method to get SingletonClass instance just once
     * @return SingletonClass object
     */
    public static SingletonClass getSingletonClass(){
        if(singletonClass == null){
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

}
