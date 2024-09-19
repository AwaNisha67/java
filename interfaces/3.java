
interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft is launching into space!");
    }
}


class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane is flying through the clouds!");
    }
}

class Helicopter implements Flyable {

    public void fly_obj() {
        System.out.println("Helicopter is hovering in the air!");
    }
}

public class Main {
    public static void main(String[] ap) {
      
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();


        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}
