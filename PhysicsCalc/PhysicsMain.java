import java.util.Scanner;
import java.lang.reflect.Method; // use a function as a parameter
// Main Class
public class PhysicsMain{
public static void main(String[] args){
    Scanner mainInput = new Scanner(System.in); // use this scanner for Main
    System.out.println("####### Physics Calculator #######\n");
    System.out.println("# Please use the SI unit for all input #\n");
    System.out.println("1 : Density,Volume and Mass (p=m/v)\n");
    System.out.println("2 : Speed,Distance and Time (d = s*t)\n");
    System.out.println("3 : Acceleration, Decelartion ((vf-vi)/time))\n");
    System.out.println("4 : Force,Mass and Acceleration (F = ma)\n");
    System.out.println("5 : Momentum (P=mv)\n");
    System.out.println("6 : Energy (see option on Energy's menu)\n");
    System.out.println("7 : Pressure (liquid,gas,solid)\n");
    System.out.println("8 : SI unit converter\n");
    System.out.println("0 : Quit\n");
    boolean Continue = true;
    while(Continue){
        System.out.println("Enter one of the number on the menu : ");
        int MainChoice = mainInput.nextInt();
        if(MainChoice==1){
            // Density,Mass,Volume (Density.java)
            Density DensityOb = new Density();
            DensityOb.getDataDense();
        }
        else if(MainChoice==2){
            // Speed,Distance,Time (Speed.java)
            Speed SpeedOb = new Speed();
            SpeedOb.getDataSpeed();
        }
        else if(MainChoice==3){
            Acceleration AccOb = new Acceleration();
            AccOb.getDataAcc();
        }
        else if(MainChoice==4){
            Force ForceOb = new Force();
            ForceOb.getDataForce();
        }
        else if(MainChoice==5){
            Momentum MomentumOb = new Momentum();
            MomentumOb.getDataMomentum();
        }
        else if(MainChoice==6){
            Energy EnergyOb = new Energy();
            EnergyOb.MainEnergy();
        }
        else if(MainChoice==7){
        //Pressure PressureOb = new Pressure();
        //PressureOb.getDataPressure();
        }

    } // closing while Continue.
    
}
}
