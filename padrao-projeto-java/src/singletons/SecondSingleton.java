package singletons;
/* eager */
public class SecondSingleton {
   
    private static SecondSingleton instance = new SecondSingleton();

    private SecondSingleton(){
 }

 public static SecondSingleton getInstance(){
    return instance;
 }
    
}
