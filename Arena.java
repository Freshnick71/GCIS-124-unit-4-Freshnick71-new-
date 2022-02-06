public class Arena {
    public static String brawl(Fighter Fighter1, Fighter Fighter2) {
        for(int count = 0; count <= 3; count++){
            //Fighter1.setHp(Fighter1.getHp() - (((Manio) Fighter2).getDamage()));
            //(((SamosA) Fighter2).Attack()))
            Fighter1.setHp(Fighter1.getHp() - ((SamosA) Fighter2).Attack());
            Fighter2.setHp(Fighter2.getHp() - ((Manio) Fighter1).dealDamage());   
            if(Fighter1.getHp() <= 0 && Fighter2.getHp() <= 0){
                return Fighter1.getName()+"and"+Fighter2.getName()+" have both collapsed, match has been declared as a tie";
            }
            if(Fighter2.getHp() <= 0) {
                //System.out.println(((Manio) Fighter1).ChampPic());
                return Fighter1.getName() + "wins";
        }
            if(Fighter1.getHp() <= 0){
                //System.out.println(((SamosA) Fighter2).ChampPic());
                return Fighter2.getName() + "wins";
        }
    }
    return "There you have it folks, you're Champion!";
    }
    public static void main(String[] args){
        Fighter Fighter1 = new Manio("Manio aka Louie G.", 100);
        Fighter Fighter2 = new SamosA("SamosA.", 200);
        brawl(Fighter1, Fighter2);
    }
}


    