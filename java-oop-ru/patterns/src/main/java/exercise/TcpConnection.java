package exercise;
import exercise.connections.*;

import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection implements Connection {
    private String ipAddress;
    private int port;
    private State state;

    public TcpConnection(String ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.state = new Disconnected(this);
    }

    public void connect() {
        this.state.connect();
    }

    public void disconnect()  {
        this.state.disconnect();
    }

    public void write(String data) {
        this.state.write(data);
    }

    public String getCurrentState() {
        return this.state.toString();
    }

    public void setState(State state) {
        this.state = state;
    }
}
// END
