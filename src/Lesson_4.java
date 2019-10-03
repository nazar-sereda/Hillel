import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson_4 {
    public static void main(String[] args) throws IOException  {

        task1();
        task2();
        task3();
        task4();
        System.out.println("Result: " + task5_1());
        System.out.println(getEvenDigitSum());
        System.out.println(getGreatestCommonDivisor(8, 60));
          task7();
        task8();


    }

    public static void task1(){

        for (int i = 10; i<=20; i++){

            System.out.println(i);

        }
    }

    public static void task2(){


        for(int i = 1; i<=100; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    public static void task3(){
        int[] numbers = new int[101];

        for (int i = 0; i <= numbers.length; i++ ){
            System.out.println(numbers[i] = 100 -i);
        }
    }

    public static void task4(){
        int sum = 0;
        int[] array = new int[10];

        for (int i = 0; i<array.length; i++){
            System.out.println(array[i] = 1 + i);
        }

        for( int j = 0; j<array.length; j++){
            if( j>=1 && j<9) {
                System.out.println(sum += array[j]);
            }
        }
    }

    public static int task5_1(){

        int a = 9;
        int b = 5;
        int c = 7;
        int d = 11;

        int min_result1 = task5_2(a, b);
        int min_result2 = task5_2(c, d);

        if (min_result1<min_result2) return min_result1;
        else return min_result2;

     }

    public static int task5_2(int x, int y){

        if(x<y) return x;
        else return y;

    }

    public static int getEvenDigitSum() throws IOException {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        int iA = Integer.parseInt(sA);
        if (iA >= 0) {


            if (iA % 2 != 0) iA--;

            sum = (iA / 2) * (1 + (iA / 2));

            return sum;
        }

        else  return -1;

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;

        while (second != 0) {
            int divisor = first % second;
            first = second;
            second = divisor;
        }
        return first;
    }

    public static void task7(){
        for (int i = 0; i<4; i++){
            for(int j = 0; j<10; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void task8(){
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }


}
