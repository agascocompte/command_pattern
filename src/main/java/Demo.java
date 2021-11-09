public class Demo {
    public static void main(String[] args) {
        BeeBot bot = new BeeBot();
        CommandHistory commandHistory = new CommandHistory();
        SimpleController controller = new SimpleController(commandHistory);
        Command moveForward = new MoveForward(bot);
        Command moveBack = new MoveBack(bot);
        Command turnLeft = new TurnLeft(bot);
        Command turnRight = new TurnRight(bot);

        controller.addCommandToHistory(moveForward);
        controller.addCommandToHistory(moveBack);
        controller.addCommandToHistory(turnLeft);
        controller.reverseAction();
        controller.addCommandToHistory(turnRight);
        controller.executeCommands();
    }
}
