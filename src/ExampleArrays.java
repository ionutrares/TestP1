/**
 * Created by IonutRares on 07.04.2016.
 */
public class ExampleArrays {

    public static void main(String[] args){

 /*       int a = 10;
        int b = 20;
        int c, d, e;
        c = 30;
        d = 40; e = 50; */

 /*       int a1 = 10;
          int a2 = 20;*/

        int[] a= {10, 20, 30, 40, 50};

        System.out.println(a[2]  + " " + a[4]);

        //enhanced for
        for(int temp : a){
            System.out.println(temp);
        }

        int[] x = new int[5];

        x[3] = 25;
        x[0] = 12;

        for(int temp2: x){
            System.out.println(temp2);

        String[] st = {"one", "two", "three"};

        }
    }
}
