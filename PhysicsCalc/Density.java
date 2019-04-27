import java.util.Scanner;// to use Scanner
class Density{

    Scanner DataDensity = new Scanner(System.in);  // use this scanner for Density class
    private double Mass;
    private double Volume;
    private double Density;
    
    // Calculates Density
    public void CalculateDense(){
        System.out.println("Mass (Kg) : ");
        Mass = DataDensity.nextDouble();
        System.out.println("Volume (m^3) : ");
        Volume = DataDensity.nextDouble();
        Density = Mass/Volume;
        System.out.println("Density : "+Density+"Kg/m^3\n");
    }
    // Calculate Mass
    public void CalculateMass(){
        System.out.println("Density (Kg/m^3) : ");
        Density = DataDensity.nextDouble();
        System.out.println("Volume (m^3) : ");
        Volume = DataDensity.nextDouble();
        Mass = Density*Volume;
        System.out.println("Mass : "+Mass+"Kg\n");
    }
    // Calculate Volume
    public void CalculateVolume(){
        System.out.println("Density (Kg/m^3) : ");
        Density = DataDensity.nextDouble();
        System.out.println("Mass (Kg) : ");
        Mass = DataDensity.nextDouble();
        Volume = Mass/Density;
        System.out.println("Volume : "+Volume+"m^3\n");
    }
  
    public void getDataDense(){
        char Input;
        System.out.println("p : density\nm : mass\nv : volume\nq : back to main menu\n");
        boolean Iteration = true;
        while(Iteration){
            System.out.println("Your Choice : ");
            Input = DataDensity.next().charAt(0);
            if(Input=='p'){
                // call "CalculateDense" here.
                CalculateDense();
            }
            else if(Input=='m'){
                // call "CalculateMass" here.
                CalculateMass();
                
            }
            else if(Input=='v'){
                // call "CalculateVolume here.
                CalculateVolume();
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
