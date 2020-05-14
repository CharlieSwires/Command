
public class Light {

    private String name;
    
    public Light(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println("Light on "+name); 
  
    }
    public void off() {
       System.out.println("Light off "+name); 
    }
    public String getName() {
        return name;
    }
 
    @Override
    public String toString() {
        return "Light [name=" + name + "]";
    }
}
