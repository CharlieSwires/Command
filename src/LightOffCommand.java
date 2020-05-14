
public class LightOffCommand implements Command {

    private Light light;
    public LightOffCommand(Light light) {
        this.light =light;
    }
    @Override
    public void execute() {
        this.light.off();

    }
    @Override
    public String toString() {
        return "LightOffCommand [light=" + light + "]";
    }
    

}
