//Writing the command invoker class
package Command_Pattern.invoker;
import Command_Pattern.command.command;
import java.util.ArrayList;
import java.util.List;
public class CommandInvoker {
    private final List<Command> commandList = new ArrayList<>();
    public void takeCommand(Command command){
        commandList.add(command);
    }
    public void executeCommands(){
        for(Command command:commandList){
            command.execute();
        }
        commandList.clear();
    }
}
