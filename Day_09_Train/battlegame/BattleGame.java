package BattleGame;

public class BattleGame {
    public static void main(String[] args) {
        pet Natos = new pet("那塔托斯","机械、龙","灵犀" );
        pet Wuu = new pet();
        Wuu.setName("魔神武王");
        Wuu.setNature("恶魔、武");
        Wuu.setRelationship("形影");

        Natos.petshow();
        System.out.println();
        Wuu.petshow();
        System.out.println( "-".repeat(10) + "战斗开始" + "-".repeat(10));

        Natos.battle(Natos,Wuu);
    }



}
