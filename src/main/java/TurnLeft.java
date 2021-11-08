public class TurnLeft implements Command {
    BeeBot bot;

    public TurnLeft(BeeBot bot) {
        this.bot = bot;
    }

    @Override
    public void execute() {
        bot.turn(-90);
    }
}
