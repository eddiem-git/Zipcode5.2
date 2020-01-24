package Attributes;

public class Health {

    public Integer hp;
    public Integer hpRegen;

    public Health(){

    }
    public Health(Integer hp, Integer HPregen){
        this.hp = hp;
        this.hpRegen = HPregen;
    }

    public Integer getHealth() {
        return hp;
    }

    public void setHealth(Integer health) {
        this.hp = health;
    }

    public Integer getHpRegen() {
        return hpRegen;
    }

    public void setHpRegen(Integer hpRegen) {
        this.hpRegen = hpRegen;
    }

}
