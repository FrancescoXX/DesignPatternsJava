package Behavioral.state;

/**
 * Created by FrancescoXX on 26/05/2018.
 */
public class OpenTCPConnectionState implements TCPConnectionState {

    private TCPConnection connection;

    public OpenTCPConnectionState(TCPConnection connection) {
        this.connection = connection;
    }

    @Override
    public void open() {
        System.out.println("Reinitializing connection");
    }

    @Override
    public void close() {
        connection.setTcpConnectionState(new ClosedTCPConnectionState(connection));
        System.out.println("Closing connection");
    }

    @Override
    public void acknowledge() throws Exception {
        System.out.println("Acknowledge");
    }
}
