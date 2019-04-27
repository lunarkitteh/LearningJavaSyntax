import java.util.Scanner;
class Momentum{
    Scanner DataMomentum = new Scanner(System.in);
    private double Mass;
    private double Velocity;
    private double Momentum;
    private double Impulse;
    private double Velocity2;
    // Calculates Momentum
    public void CalculateMomentum(){
        System.out.println("Mass (Kg) : ");
        Mass = DataMomentum.nextDouble();
        System.out.println("Velocity (m/s) : "); // (iv-fv)/t
        Velocity = DataMomentum.nextDouble();
        Momentum = Mass*Velocity;
        System.out.println("Momentum : "+Momentum+"Kg m/s\n");
    }
    // Calculates Mass
    public void CalculateMass(){
        System.out.println("Momentum (Kg m/s) : ");
        Momentum = DataMomentum.nextDouble();
        System.out.println("Velocity (m/s) : ");
        Velocity = DataMomentum.nextDouble();
        Mass = Momentum/Velocity;
        System.out.println("Mass : "+Mass+"Kg\n");
    }
    // Calculates Velocity
    public void CalculateVelocity(){
        System.out.println("Momentum (Kg m/s) : ");
        Momentum = DataMomentum.nextDouble();
        System.out.println("Mass (Kg) : ");
        Mass = DataMomentum.nextDouble();
        Velocity = Momentum/Mass;
        System.out.println("Velocity : "+Velocity+"m/s\n");
    }
    // Calculates Impulse
    public void CalculateImpulse(){
        System.out.println("Mass (Kg) : ");
        Mass = DataMomentum.nextDouble();
        System.out.println("Final Velocity (m/s) : ");
        Velocity2 = DataMomentum.nextDouble();
        System.out.println("Initial Velocity (m/s) : ");
        Velocity = DataMomentum.nextDouble();
        Impulse = Mass*(Velocity2-Velocity);
    }
    public void getDataMomentum(){
        char Input;
        System.out.println("P : momentum\nm : mass\nv : velocity\nj : impulse (m*v)\nq : back to main menu\n");
        boolean Iteration = true;
        while(Iteration){
            System.out.println("Your Choice : ");
            Input = DataMomentum.next().charAt(0);
            if(Input=='P'){
                // call "CalculateMomentum" here.
                CalculateMomentum();
            }
            else if(Input=='m'){
                // call "CalculateMass" here.
                CalculateMass();
            }
            else if(Input=='v'){
                // call "CalculateVelocity here.
                CalculateVelocity();
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