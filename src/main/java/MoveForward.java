public class MoveForward implements Command {
    BeeBot bot;

    public MoveForward(BeeBot bot) {
        this.bot = bot;
    }

    @Override
    public void execute() {
        bot.move(15);
    }
}
