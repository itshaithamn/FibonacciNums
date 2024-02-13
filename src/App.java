public class App {
    public static void main(String[] args) throws Exception{
        String arg = args[0];
        int numbers = Integer.parseInt(arg);
        if(numbers > 0){
            calculate(args);
        } else{
            throw new Exception("Integer must be greater than 0 or non-negative.");
        }
    }

    public static void calculate(String[] args){
        String arg = args[0];
        int numbers = Integer.parseInt(arg);
        int maxNum = numbers + 2;
        double[] array = new double[maxNum];

        double z = 0;
        array[0] = 0;
        array[1] = 1;
        z = array[1];
        array[2] = array[0] + z;
        z = array[2];
        for(int i = 0; i < array.length - 2; i++){
            array[i + 2] = array[i] + z;
            z = array[i + 2];
        }
        System.out.printf("%.0f", array[(int) numbers]);
    }
}
