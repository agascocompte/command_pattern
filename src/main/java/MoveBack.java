public class MoveBack implements Command {
    BeeBot bot;

    public MoveBack(BeeBot bot) {
        this.bot = bot;
    }

    @Override
    public void execute() {
        bot.move(-15);
    }
}
