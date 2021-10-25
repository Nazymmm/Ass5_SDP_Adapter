package Ass6_new;

public class TestPlug {
    public static void main(String[] args) {

        Socket socket = new Socket();

        socket.setPlug(new NewPlug());

        socket.plugging();

        socket.setPlug(new SimplePlug());

        socket.plugging();

    }
}
