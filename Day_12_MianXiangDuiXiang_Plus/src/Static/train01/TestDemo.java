package Static.train01;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类中的两个方法
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        String str = ArrayUtills.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.5,2.9,2.8,9.0,2.4};
        double aver = ArrayUtills.getAverage(arr2);
        System.out.println(aver);

    }
}
