package exercise.connections;

public interface State {
    String toString();
    void disconnect();
    void write(String data);
    void connect();
}
