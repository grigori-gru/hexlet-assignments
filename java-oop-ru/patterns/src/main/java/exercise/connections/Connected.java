package exercise.connections;

// BEGIN
public class Connected implements State {
    private Connection connection;

    public Connected(Connection connection) {
        this.connection = connection;
    }

    public String toString() {
        return "connected";
    }

    public void disconnect() {
        Connection c = this.connection;
        c.setState(new Disconnected(c));
    }

    @Override
    public void write(String data) {
        System.out.println(data);
    }

    @Override
    public void connect() {
        System.out.println("Error! Already connected");
    }
}

// END
