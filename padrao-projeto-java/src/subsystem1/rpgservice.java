package subsystem1;

public class rpgservice {

    private rpgservice(){}

    public static void criarPersonagem(String nome, String classe, String subclasse){
        System.out.println("Personagem criado!");
        System.out.println(nome);
        System.out.println(classe);
        System.out.println(subclasse);
    }
}
