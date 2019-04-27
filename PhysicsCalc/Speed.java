import java.util.Scanner;// to use Scanner
class Speed{
Scanner DataSpeed = new Scanner(System.in); // use this scanner thoughout this class
private double Speed;
private double Distance;
private double Time;
// Calculates Speed
public void CalculateSpeed(){
System.out.println("Time (hour) : ");
Time = DataSpeed.nextDouble();
System.out.println("Distance (Km) : ");
Distance = DataSpeed.nextDouble();
Speed = Distance/Time;
System.out.println("Speed : "+Speed+" Km/h\n");
}
// Calculates Time
public void CalculateTime(){
System.out.println("Speed (Km/h) : ");
Speed = DataSpeed.nextDouble();
System.out.println("Distance (Km) : ");
Distance = DataSpeed.nextDouble();
Time = Distance/Speed;
System.out.println("Time taken : "+Time+" hour\n");
}
// Calculates Distance
public void CalculateDistance(){
System.out.println("Speed (Km/h) : ");
Speed = DataSpeed.nextDouble();
System.out.println("Time (hour) : ");
Time = DataSpeed.nextDouble();
Distance = Time*Speed;
System.out.println("Distance : "+Distance+" Km\n");
}

public void getDataSpeed(){
        char Input;
        System.out.println("d : distance\nt : time\ns : speed\nq : back to main menu\n");
        boolean Iteration = true;
        while(Iteration){
            System.out.println("Your Choice : ");
            Input = DataSpeed.next().charAt(0);
            if(Input=='d'){
                // call "CalculateDistance" here.
                CalculateDistance();
            }
            else if(Input=='t'){
                // call "CalculateTime" here. 
                CalculateTime();   
            }
            else if(Input=='s'){
                // call "CalculateSpeed here.
                CalculateSpeed();
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