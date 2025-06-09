package BattleGame;

import java.util.Random;

public class pet {
    private String name;
    private String nature;
    private String relationship;
    private String[] Natosskills = {"深渊恐惧","死亡绝境","升龙咆哮","物盛则衰"};
    private String[] Wuuskills = {"魔神现世","突袭","魔刃噬魂","破茧杀戮"};
    private int blood =100;

    Random r = new Random();
    public pet(){

    }
    public pet(String name,String nature,String relationship){
        this.name = name;
        this.nature = nature;
        this.relationship = relationship;

    }
    public void petshow(){
        System.out.println(this.name);
        System.out.println("系别:" + this.nature);
        System.out.println("亲密度:" + this.relationship);
        if(this.name == "魔神武王"){
            System.out.println("技能:魔神现世||突袭||魔刃噬魂||破茧杀戮");
        } else if (this.name == "那塔托斯") {
            System.out.println("技能:深渊恐惧||死亡绝境||升龙咆哮||物盛则衰");
        }


    }

    public void setName(String name){
        this.name = name;
    }
    public String showName(String name){
        return name;
    }

    public void setNature(String nature){
        this.nature = nature;
    }
    public String showNature(String nature){
        return nature;
    }

    public void setRelationship(String relationship){
        this.relationship = relationship;
    }
    public String showRelationship(String relationship){
        return relationship;
    }

    public void attack(pet enemy){
        int hurt = r.nextInt(1,20);
        enemy.blood = enemy.blood - hurt;
        int skill = r.nextInt(0,4);
        if(this.name == "魔神武王") {
            System.out.println(this.name + "使用了" + Wuuskills[skill] + "对" + enemy.name + "造成了" + hurt + "HP伤害");
        }else if(this.name == "那塔托斯"){
            System.out.println(this.name + "使用了" + Natosskills[skill] + "对" + enemy.name + "造成了" + hurt + "HP伤害");
        }

        System.out.println(enemy.name + "剩余血量为" + enemy.blood + "HP");
    }

    public void battle(pet a,pet b){
        int n = 0;
        while(true){
            a.attack(b);
            if(b.blood == 0 || b.blood < 0){
                    System.out.printf("最终%s打败%s胜利了",a.name,b.name);
                    break;
            }
            b.attack(a);
            if(a.blood == 0 || a.blood < 0){
                System.out.printf("最终%s打败%s胜利了",b.name,a.name);
                n++;
                break;




            }
        }
    }

}
