package Ass6_new;

public class Socket {
    private String type;

    private Plug plug;

    public void plugging() {
        plug.connect();
        System.out.println("Plugging...");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPlug(Plug plug) {
        this.plug = plug;
    }
}
