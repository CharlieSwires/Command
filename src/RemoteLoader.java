
public class RemoteLoader {

    public static void main(String[] args) {
        Light bedroom = new Light("bedroom");
        Light livingRoom = new Light("living room");
        Light diningRoom = new Light("dining room");
        Light kitchen = new Light("kitchen");

        LightOnCommand bedroomOn = new LightOnCommand(bedroom);
        LightOnCommand livingRoomOn = new LightOnCommand(livingRoom);
        LightOnCommand diningRoomOn = new LightOnCommand(diningRoom);
        LightOnCommand kitchenOn = new LightOnCommand(kitchen);

        LightOffCommand bedroomOff = new LightOffCommand(bedroom);
        LightOffCommand livingRoomOff = new LightOffCommand(livingRoom);
        LightOffCommand diningRoomOff = new LightOffCommand(diningRoom);
        LightOffCommand kitchenOff = new LightOffCommand(kitchen);
 
        RemoteControl remote = new RemoteControl();
        remote.setCommand(0,bedroomOn,bedroomOff);
        remote.setCommand(1,livingRoomOn,livingRoomOff);
        remote.setCommand(2,diningRoomOn,diningRoomOff);
        remote.setCommand(3,kitchenOn,kitchenOff);

        System.out.println(remote);
       
        remote.onPushed(0);
        remote.offPushed(0);
        remote.onPushed(1);
        remote.offPushed(1);
        remote.onPushed(2);
        remote.offPushed(2);
        remote.onPushed(3);
        remote.offPushed(3);
    
    }

}
