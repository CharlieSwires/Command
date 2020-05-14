import java.util.Arrays;

public class RemoteControl {
    private Command[] onCommands; 
    private Command[] offCommands;
    private static final int MAX_BUTTONS = 7;
    
    public RemoteControl() {
        onCommands = new Command[MAX_BUTTONS];
        offCommands = new Command[MAX_BUTTONS];
        
        for(int i = 0; i <MAX_BUTTONS;i++) {
            onCommands[i] = null;
            offCommands[i] = null;
           
        }
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
        
    }
    
    public void onPushed(int slot) {
        this.onCommands[slot].execute();
    }
    public void offPushed(int slot) {
        this.offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("----------------Remote setup-----------------\n");
        for(int i = 0; i <MAX_BUTTONS;i++) {
            if(this.onCommands[i] != null) {
                sb.append("slot["+i+"] on = "+this.onCommands[i]+
                        " off = "+this.offCommands[i]+"\n");
               
               
            }
         }
        return sb.toString();
    }
}
