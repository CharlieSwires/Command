
public class Facade {

    Light bedroom;
    Light livingRoom;
    Light diningRoom;
    Light kitchen;

    public Facade(Light bedroom, Light livingRoom, Light diningRoom, Light kitchen) {
        this.bedroom=bedroom;
        this.livingRoom=livingRoom;
        this.diningRoom=diningRoom;
        this.kitchen=kitchen;
    }

    public void allOn() {
        bedroom.on();
        livingRoom.on();
        diningRoom.on();
        kitchen.on();
    }   
    public void allOff() {
        bedroom.off();
        livingRoom.off();
        diningRoom.off();
        kitchen.off();

    }
}
