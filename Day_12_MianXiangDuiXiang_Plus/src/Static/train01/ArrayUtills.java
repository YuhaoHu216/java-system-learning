package Static.train01;

public class ArrayUtills {
    //私有化构造方法，不让外界创建其对象
    private ArrayUtills(){}

    //定义为静态方便调用
    //返回整数数组内容
    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //返回平均分
    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
