package strategy;

public class Udyr {
    private Stance skill;

    public void setSkill(Stance skill) {
        this.skill = skill;
    }

    public void stand(){
        skill.stand();
    }
    
}
