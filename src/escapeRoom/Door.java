package escapeRoom;

public class Door extends Equipment {
    private boolean open;
    private Key key;


    public Door(Key key) {
        super("drzwi");
        this.key = key;
    }

    @Override
    String use(Context context) {

        String message;
        if (!open && context.hasActivatorGotItem(key)) {
            open = true;
            message = "Drzwi otwarto, wygrywasz grę";
            context.endGame();

        } else {
            message = "Potrzebujesz klucza do otwarcia drzwi";
        }
        return message;
    }
}
