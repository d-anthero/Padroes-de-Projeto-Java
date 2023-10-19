package facade;

import subsystem1.rpgservice;
import subsystem2.classesApi;

public class Facade {
    
    public void criarFicha(String nome, String poder){
        String subclasse = classesApi.getInstance().recuperarSubClasses(poder);
        String classe = classesApi.getInstance().recuperarClasse(poder);
       rpgservice.criarPersonagem(nome, classe, subclasse); 
    }
}
