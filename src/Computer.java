public class Computer {
    String ram;
    String brand;
    String model;
    double price;

    Computer(){

    }

    Computer(String ram, String brand, String model, double price){
        this.price = price;
        this.ram = ram;
        this.brand = brand;
        this.model = model;
    }

    private void startKernel(){
        
    }

    void start(){
        startKernel();
        System.out.println("Computer "+brand+" - "+model+" started.");
    }

    void shutDown(){
        System.out.println("Computer "+brand+" - "+model+" has shuted down.");
    }
}
