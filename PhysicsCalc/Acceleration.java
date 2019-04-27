import java.util.Scanner;// to use Scanner
class Acceleration{
    Scanner dataAcc = new Scanner(System.in);
    private double InitialV;
    private double FinalV;
    private double Time;
    private double Acceleration;
    
    // Calculates Acceleration
    public void CalculateAcc(){
        System.out.println("Final velocity (m/s) : ");
        InitialV = dataAcc.nextDouble();
        System.out.println("Initial velocity (m/s) : ");
        FinalV = dataAcc.nextDouble();
        System.out.println("Time (second) : ");
        Time = dataAcc.nextDouble();
        Acceleration = (FinalV-InitialV)/Time;
        System.out.println("Acceleration : "+Acceleration+" m/s^2\n");
    }
    // Calculates Deceleration
    public void CalculateDec(){
        System.out.println("Final velocity (m/s) : ");
        InitialV = dataAcc.nextDouble();
        System.out.println("Initial velocity (m/s) : ");
        FinalV = dataAcc.nextDouble();
        System.out.println("Time (second) : ");
        Time = dataAcc.nextDouble();
        Acceleration = (FinalV-InitialV)/Time;
        System.out.println("Deceleration : "+Acceleration+" m/s^2\n");
    }
    // Calculate Time
    public void CalculateTime(){
        System.out.println("Acceleration (m/s^2) : ");
        Acceleration = dataAcc.nextDouble();
        System.out.println("Final velocity (m/s) : ");
        FinalV = dataAcc.nextDouble();
        System.out.println("Initial velocity (m/s) : ");
        InitialV = dataAcc.nextDouble();
        Time = Acceleration/(FinalV-InitialV);
        System.out.println("Time : "+Time+" sec\n");
    }

    public void getDataAcc(){
        char Input;
        System.out.println("a : acceleration\nd : deceleration\nt : time\nq : back to main menu\n");
        boolean Iteration = true;
        while(Iteration){
            System.out.println("Your Choice : ");
            Input = dataAcc.next().charAt(0);
            if(Input=='a'){
                // call "CalculateAcc" here.
                CalculateAcc();
            }
            else if(Input=='d'){
                // call "CalculateDec" here.  
                CalculateDec();
            }
            else if(Input=='t'){
                // call "CalculateTime here.
                CalculateTime();
            }
            else if(Input=='q'){
                Iteration=false;
                break;
            }
            else{
            System.out.println("Your choice is not available\n");
            }
        }
    }
}