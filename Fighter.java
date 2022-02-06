public abstract class Fighter{
    protected String Name;
    protected int Hp;

    public Fighter(final String Name, /*final*/ int Hp) {
        this.Name = Name;
        this.Hp = Hp;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }
    
    public int getHp() {
        return Hp;
    }
    
    public void setHp(int Hp) {
        this.Hp = Hp;
    }
}