public class goodstest {
    public static void main(String[] args) {
        goods[] arr = new goods[3];

        goods g1 = new goods("001","遥遥领先",553.1,20);
        goods g2 = new goods("002","北京小米",20000000,500);
        goods g3 = new goods("003","枸杞",2,65);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for(int i = 0;i < arr.length;i++){
//            System.out.println(arr[i].getPrize());
//            arr[i].getId();
//            arr[i].getName();
//            arr[i].getCount();
            goods good = arr[i];
            System.out.println(good.getId() + good.getName()  + good.getPrize() + good.getCount());
        }
    }
}
