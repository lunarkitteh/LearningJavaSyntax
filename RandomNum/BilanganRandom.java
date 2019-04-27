import java.util.Scanner;
import java.util.Random;
public class BilanganRandom {
    public static void main(String[] args) {
        int rand;
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    Random x = new Random();
    System.out.print("A = ");
    int a = input.nextInt ();
    System.out.print("B = ");
    int b = input.nextInt ();
    if(a>b){
        rand = x.nextInt(a-b)+b;
    }
    else{
    rand = x.nextInt(b-a)+a;
    }
    
    if(rand%2!=0){
    rand+=1;
    }
    System.out.println(rand);
}
}
