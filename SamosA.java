import java.util.Random;

public class SamosA extends Fighter{
    protected int attack;
    public SamosA(String Name, int Hp) {
        super(Name, Hp);
        this.Name = Name;
        this.Hp = Hp;
    }
    
    public String getName(){
        return this.Name;
    }
    public int getHp(){
        return this.Hp;
    }
    public int Attack(){
        Random randomizer = new Random();
        int rando = randomizer.nextInt(4);
        //setDamage(damage);
        if(rando == 0 || rando == 1 || rando == 2){
            int n_damage = 40;
            setAttack(n_damage);
            getAttack();
            //return n_damage;
        }
        if(rando == 3){
            int ultra_damage = 75;
            setAttack(ultra_damage);
            getAttack();
            //return ultra_damage;
        }
        return 0;
}
    
    public void setAttack(int attack) {
        this.attack = attack;
    }
    
    public int getAttack() {
        return this.attack;
    }
    public String ChampPic(){
        return "And the winner is " + getName() + getHp() + getAttack();
    }
}
