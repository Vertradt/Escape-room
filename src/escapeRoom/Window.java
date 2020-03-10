package escapeRoom;

public class Window extends Equipment {
    private boolean open;

    public Window() {
        super("okno");
    }

    @Override
    String use(Context context) {
        String message;
        if (!open) {
            open = true;
            message = "Okno otwarto";

        } else {
            open = false;
            message = "Okno zamknięto";
        }
        return message;
    }


}
