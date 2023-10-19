package subsystem2;

public class classesApi {
        private static classesApi instance = new classesApi();

    private classesApi(){
 }

     public static classesApi getInstance(){
    return instance;
 }

    public String recuperarClasse(String classe){
        return "Mago";
    }

    public String recuperarSubClasses(String subclasse){
        return "Feiticeiro, Bruxo";
    }
    
}
