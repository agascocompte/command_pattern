public class TurnRight implements Command {
    BeeBot bot;

    public TurnRight(BeeBot bot) {
        this.bot = bot;
    }

    @Override
    public void execute() {
        bot.turn(90);
    }
}
