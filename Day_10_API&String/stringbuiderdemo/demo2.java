package stringbuiderdemo;

public class demo2 {
    public static void main(String[] args) {
        String[] arr= {"CNM","TMD","MLGB","SB","CTMD"};

        String talk = "你他妈真会玩,CNM,TMD.";

        for (int i = 0; i < 5; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
