import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private final List<Command> commandList;

    public CommandHistory() {
        commandList = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void removeLastCommand() {
        commandList.remove(commandList.size() - 1);
    }

    public List<Command> getCommandList() {
        return commandList;
    }
}
