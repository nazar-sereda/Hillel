//import static jdk.internal.org.objectweb.asm.util.Printer.printList;

public class lesson_3 {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1(){
        int i = 0;
        for (i =0; i<5; i++){
            System.out.println("Hello Nazar");
        }

    }

    public  static  void  task2(){
        boolean variable1 = false;
        byte variable2 = 2;
        char variable3 = '3';
        short variable4 = -23;
        int variable5 = -56;
        long variable6 = -2l;
        float variable7 = (float) 3.14;
        double variable8 = 8.123;

        System.out.println(variable6);
    }

    public static void task3(){
        int a = 3;
        int b = 7;
        int result;
        result = a*b;
        System.out.println(result);
    }

    public static void task4(){
        //"4. Fix the program to get the correct result:

            double a = 5;
            double b = 10;


                double result = a/ b;

                System.out.println(result);

        }
    public static void task5(){
        int a = 1;
        int b = 3;
        int c = 9;
        int d = 27;

        int result = -(a+(-b+c) -d);
        System.out.println(result);
    }

    public  static void task6(){
        //"6. Comment redundant strings to get the output ""Happy Java Learning"":


                //String s = "Java";
                //System.out.println("Happy");
                //System.out.println("Java Learning");
               // System.out.println("programming");
                System.out.print("Happy Java");
               // System.out.println("weekend");
               // System.out.println(s);
              //  System.out.print("Python");
                System.out.print(" ");
                System.out.println("Learning");


    }

    public static void task7(){
        //"7. Comment variables which are never used.


                int a = 10;
                int b = 15;
                double c = b + 38;
               // int d = a + 12;
                //double e = 12.3;
                String s = "s" + a;
                String s1 = a + "b";
                //String s2 = "a";
                String s3 = s1 + "a";
                String s4 = s3 + "b";
                System.out.println(c + s4 + s);


    }

//    public static void task8(){
//
//         transformIntToChar(72,101,108,108,111,32,119,111,114,108,100);
//    }
//
//    private static void transformIntToChar(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
//        printList



}
