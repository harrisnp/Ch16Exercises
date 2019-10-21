public class Loopy {
    
    public static void main(String[]args) {
            System.out.println(doStuff(3,3));
            
            int x = doStuff(3,5);
            x = x + 1;
            doStuff(6,8);
    }

    public static int doStuff(int a, int b) {
         int x = a + b;
         return x;
    }

}





        // // int i = 0;
        // int total = 0;
        // int times = 10;

        // // while (i < times) {
        //     // total +=i;
        //     // i++;
        // // }

        // for (int i = 0, j = 0; i < times; i++){
        //     total += 1;
        // }
    
        // System.out.println(total == times * (times - 1) / 2);