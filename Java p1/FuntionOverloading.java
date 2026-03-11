public class FuntionOverloading {

    public static int sum(int a , int b){
        return a+b;
    }
    //sum of three numbers
//    public static int sum(int a , int b,int c){
//        return a+b+c;
//    }
    //to caluculate sum of float numbers
    public static float sum(float a,float b){
        return a+b;
    }

    public static void main (String args[]){
        System.out.println(sum(1,2));
        System.out.println(sum(1.4f,2.3f));

    }
}
