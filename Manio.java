import java.util.Random;

public class Manio extends Fighter{
    protected int attack;
    protected int damage;
    public Manio(String Name, int Hp) {
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
    public void /*int*/ Attack(){
        //Random rando = new Random();
        int poss = (int)(Math.random() * ((50-25) + 1)) + 25;
        System.out.println(poss);
        setAttack(poss);
        //return poss;
    }

    
    public void setAttack(int attack) {
        this.attack = attack;
    }
    
    public int getAttack() {
        //Attack();
        return this.attack;
    }
    public int dealDamage(){
        Attack();
        Random randomizer = new Random();
        int rando = randomizer.nextInt(4);
        //setDamage(damage);
        if(rando == 0){
            int n_damage = 0;
            setDamage(n_damage);
            return n_damage;
        }
        return getAttack();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    public int getDamage() {
        return this.damage;
    }
    public String ChampPic(){
        return "And the winner is " + getName() + getHp() + getAttack() + getDamage();
    }
}
