package singletons;
/* lazy holder */
public class ThirdSingleton {
    private static class Holder{
    private static ThirdSingleton instance = new ThirdSingleton();
    }
    private ThirdSingleton(){
 }

 public static ThirdSingleton getInstance(){
    return Holder.instance;
 }
    
}
