public class SimpleController {
    private final CommandHistory commandHistory;

    public SimpleController(CommandHistory commandHistory) {
        this.commandHistory = commandHistory;
    }

    public void addCommandToHistory(Command command) {
        commandHistory.addCommand(command);
    }

    public void reverseAction() {
        commandHistory.removeLastCommand();
    }

    public void executeCommands() {
        for (Command command: commandHistory.getCommandList()) {
            command.execute();
        }
    }
}
