public class GFPrivate_Test {
    public static void main(String[] args) {
        GFPrivate G = new GFPrivate(19,"Shiina Mashiro");
        GFPrivate F = new GFPrivate(18,"Aoyama Manami");
        GFPrivate P = new GFPrivate();
        P.setName("");
        P.setAge(0);
//        F.setName("Shiina Mashiro");
//        G.setAge(19);
//        G.setName("Aoyama Nanami");
        System.out.println(F.showName() + " " + F.showAge());
        System.out.println(G.showName() + " " + G.showAge());
    }
}
