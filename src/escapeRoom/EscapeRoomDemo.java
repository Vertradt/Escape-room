package escapeRoom;



public class EscapeRoomDemo {

    void startProgram() {
        Key key = new Key();

        Place room = new Room();
        room.add(new Window());
        room.add(key);
        room.add(new Door(key));

        Game game = new Game(room, new Player());
        Controller controller = new Controller(game);
        controller.start();


    }

}
