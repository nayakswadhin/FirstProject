public class Conditions {
    public static void main(String[] args) {
        boolean condition = true && false;
        if(condition){
            System.out.println("Is not going to be printed");
            condition = true;
        }
        System.out.println("Is going to be printed., value of condition is: "+condition);
        condition = true;
        if(condition == false){
            System.out.println("Printed because condition: "+condition);
        }else if(condition){
            System.out.println("Will else if execute?");
        }else{
            System.out.println("Will else execute?");
        }



        String subscrition = "Hotstar";

        switch(subscrition){
            case "Netflix":
                System.out.println("I have Netflix subscription");
                break;
            case "Prime":
                System.out.println("I have Prime subscription");
                break;
            case "Hotstar":
                System.out.println("I have Hotstar subscription");
                break;
            default:
                System.out.println("I do not have any subscription");
        }
    }
}
