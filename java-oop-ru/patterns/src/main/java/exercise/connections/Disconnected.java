package exercise.connections;

// BEGIN
public class Disconnected implements State {
    private Connection connection;

    public Disconnected(Connection connection) {
        this.connection = connection;
    }

    public void disconnect() {
        System.out.println("Error! Connection already disconnected");
    }

    @Override
    public void write(String data) {
        System.out.println("Error! Connection is disconnected");
    }

    public String toString() {
        return "disconnected";
    }

    public void connect() {
        Connection c = this.connection;
        c.setState(new Connected(c));
    }
}
// END
