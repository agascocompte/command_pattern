public class Demo {
    public static void main(String[] args) {
        BeeBot bot = new BeeBot();
        Command moveForward = new MoveForward(bot);
        Command moveBack = new MoveBack(bot);
        Command turnLeft = new TurnLeft(bot);
        Command turnRight = new TurnRight(bot);

        SimpleController controller = new SimpleController();
        controller.setCommand(moveForward);
        controller.executeCommand();

        controller.setCommand(moveBack);
        controller.executeCommand();

        controller.setCommand(turnLeft);
        controller.executeCommand();

        controller.setCommand(turnRight);
        controller.executeCommand();
    }
}
