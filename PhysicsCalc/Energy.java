import java.util.Scanner;
class Energy{
    Scanner DataEnergy = new Scanner(System.in);  //use this scanner for Energy class
    double Gravity = 9.8;
    private double PE;
    private double KE;
    private double Efficiency;
    private double Power;
    private double Mass;
    private double Height;   // OR DISTANCE
    private double Velocity;
    // use these variables below for calculating work and energy.
    private double Time;
    private double Energy; // Any form
    private double Force;  // for calculating work (Mass*Distance)
    private double Power2;
    public void PE(){
        System.out.println("Mass (Kg) : ");
        Mass = DataEnergy.nextDouble();
        System.out.println("Height/Distance (m) : ");
        Height = DataEnergy.nextDouble();
        PE = Mass*Gravity*Height;
        System.out.println("Potential energy : "+PE+"J\n");
    }
    public void KE(){
        System.out.println("Mass (Kg) : ");
        Mass = DataEnergy.nextDouble();
        System.out.println("Velocity (m/s) : ");
        Velocity = DataEnergy.nextDouble();
        KE = 0.5*Mass*(Velocity*Velocity);
        System.out.println("Kinetic energy : "+KE+"J\n");
    }
    public void V(){
        System.out.println("Mass (Kg) : ");
        Height = DataEnergy.nextDouble();
        System.out.println("Potential Energy (J) : ");
        PE = DataEnergy.nextDouble();
        double v = (PE*2)/Mass;
        Velocity = Math.sqrt(v);
        System.out.println("Velocity : "+Velocity+"m/s\n");
    }
    public void P(){
        System.out.println("Mass (Kg) : ");
        Mass = DataEnergy.nextDouble();
        System.out.println("Height/Distance (m) : ");
        Height = DataEnergy.nextDouble();
        System.out.println("Time (s) : ");
        Time = DataEnergy.nextDouble();
        Power = ((Mass*Gravity)*Height)/Time;
        System.out.println("Power : "+Power+"Watts (J/s)\n");
    }
    public void EF(){
        System.out.println("Power Input (Watt) : ");
        Power = DataEnergy.nextDouble();
        System.out.println("Power Output (Watt) : ");
        Power2 = DataEnergy.nextDouble();
        Efficiency = (Power2/Power)*100;
        System.out.println("Efficiency : "+Efficiency+"%\n");
    }
    public void MainEnergy(){
        System.out.println("PE : Potential Energy\nKE : Kinetict Energy\nV : Velocity (with PE&KE)\nP : Power\nEF : Efficiency\nYour choice : ");
        boolean Iteration = true;
        while(Iteration){
         String Input = DataEnergy.nextLine();
        switch(Input){
            case "PE":
            case "pe":
            // Call PE here.
            PE();
            break;
            case "KE":
            case "ke":
            // Call V here.
            KE();
            break;
            case "V":
            case "v":
            V();
            break;
            case "P":
            case "p":
            // Call Power here.
            P();
            break;
            case "EF":
            case "ef":
            // Call EF here.
            EF();
            break;
            case "q":
            case "Q":
            Iteration = false;
            break;
            default:
            break;
        }
        }
    }
}
