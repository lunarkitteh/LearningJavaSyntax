import java.util.Scanner;
class Force{
Scanner dataForce = new Scanner(System.in);
private double Force;
private double Mass;
private double Acceleration;  

// Calculates Force
public void CalculateForce(){
System.out.println("Mass (kg) : ");
Mass = dataForce.nextDouble();
System.out.println("Acceleration (m/s^2) : ");
Acceleration = dataForce.nextDouble();
Force = Mass*Acceleration;
System.out.println("Force : "+Force+"N\n");
}
// Calculates Mass
public void CalculateMass(){
    System.out.println("Force (N) : ");
    Force = dataForce.nextDouble();
    System.out.println("Acceleration (m/s^2) : ");
    Acceleration = dataForce.nextDouble();
    Mass = Force/Acceleration; 
    System.out.println("Mass : "+Mass+"Kg\n");
}
public void CalculateAcc(){
    System.out.println("Force (N) : ");
    Force = dataForce.nextDouble();
    System.out.println("Mass (kg) : ");
    Mass = dataForce.nextDouble();
    Acceleration = Mass/Force;
    System.out.println("Acceleration : "+Acceleration+"m/s^2)\n");
}
public void getDataForce(){
        char Input;
        System.out.println("f : force\nm : mass\na : acceleration\nq : back to main menu\n");
        boolean Iteration = true;
        while(Iteration){
            System.out.println("Your Choice : ");
            Input = dataForce.next().charAt(0);
            if(Input=='f'){
                // call "CalculateForce" here.
                CalculateForce();
            }
            else if(Input=='m'){
                // call "CalculateMass" here.  
                CalculateMass();
            }
            else if(Input=='a'){
                // call "CalculateAcc here.
                CalculateAcc();
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