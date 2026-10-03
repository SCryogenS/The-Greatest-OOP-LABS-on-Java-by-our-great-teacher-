class Vehiсle{
    protected String brand;
    protected int speed;
    protected int year;

    public Vehiсle(String brand, int speed, int year){
        this.brand = brand;
        this.speed = speed;
        this.year = year;

    }
    public void go(){
        System.out.println("Our speed is " + speed + "km/h\n");
    }

    public void addSpeed(int newspeed){
        this.speed += newspeed;
        System.out.println("We became faster\n");
    }

    public void loseSpeed(int newspeed){
        this.speed -= newspeed;
        System.out.println("We became slower\n");
    }
}

class Train extends Vehiсle{
    private int passengers;
    private int wheels;
    private String nextstation;

    public Train(int passengers,int wheels, String nextstation, String brand, int speed, int year){
        super(brand, speed, year);
        this.nextstation = nextstation;
        this.passengers = passengers;
        this.wheels = wheels;
    }

    public void announce(){
        System.out.println("Next station is " + nextstation + "\n");
    }

    public void passengersleft(int amount){
        this.passengers = passengers - amount;
        System.out.println(amount + "passengers left train, currently in the train are" + passengers + "passengers\n");
    }

    public void passengersget(int amount){
        this.passengers = passengers + amount;
        System.out.println(amount + "passengers get to train, currently in the train are" + passengers + "passengers\n");
    }

    public void updateStation(String newstation){
        this.nextstation = newstation;
    }
}

class ElectricTrain extends Train{
    private int carriages;
    private String driver;
    private String[] crew;

    public ElectricTrain(int carriages, String driver, String[] crew, int passengers,int wheels, String nextstation,String brand, int speed, int year){
        super(passengers, wheels, nextstation, brand, speed, year);
        this.carriages = carriages;
        this.driver = driver;
        this.crew = crew;
   }  
   
    public void getcarriages(){
        System.out.println("ElectricTrain has " + carriages + " carriages\n");
    }

    public void AskStaffHelp(String name){
        for (String hum : this.crew){
            if (hum.equals(name)){
                System.out.println("Hello, my name is " + name + " what kind of help do you need?\n");
                return;
            }
        }
        System.out.println("No such member of the staff\n");
    }

    public void stopTheTrain(){
        System.out.println("Train is stoped");
        this.speed = 0;
        super.announce();
    }
}  

public class Main {
    public static void main(String[] args) {
        String[] TrainStaff = {"Liza", "Andrey", "Andrey-Checatilo", "Trump", "Obama", "Einstein", "Eipstein", "Gazan"};

        ElectricTrain electro = new ElectricTrain(
            67,
            "Kanya West",
            TrainStaff,
            66,
            1,
            "Sinergia",
            "Apple",   
            285,
            2026
    );

        electro.announce();
        electro.go();
        electro.updateStation("Dagestan");
        electro.addSpeed(20);
        electro.stopTheTrain();
        electro.addSpeed(300);
        electro.go();

    }
}
