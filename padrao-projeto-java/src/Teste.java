import facade.Facade;
import strategy.BearStance;
import strategy.PhoenixStance;
import strategy.Stance;
import strategy.TigerStance;
import strategy.TurtleStance;
import strategy.Udyr;

public class Teste {
    public static void main(String[] args) {

        Stance Tiger = new TigerStance();
        Stance Turtle = new TurtleStance();
        Stance Phoenix = new PhoenixStance();
        Stance Bear = new BearStance();

        Udyr udyr = new Udyr();
        udyr.setSkill(Tiger);
            udyr.stand();
            
        udyr.setSkill(Turtle);
            udyr.stand();

        udyr.setSkill(Phoenix);
            udyr.stand();

        udyr.setSkill(Bear);
            udyr.stand();

        //Facade

        Facade facade = new Facade();
        facade.criarFicha("Davi", "Magia");
    }
}
