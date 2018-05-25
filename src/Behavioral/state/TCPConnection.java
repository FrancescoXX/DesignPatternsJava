package Behavioral.state;

/**
 * Created by FrancescoXX on 26/05/2018.
 */
public class TCPConnection {

    private TCPConnectionState tcpConnectionState = new ClosedTCPConnectionState(this);

    public void open() {
        tcpConnectionState.open();
    }

    public void close() {
        tcpConnectionState.close();
    }

    public void acknowledge() throws Exception {
        tcpConnectionState.acknowledge();
    }

    public void setTcpConnectionState(TCPConnectionState tcpConnectionState) {
        this.tcpConnectionState = tcpConnectionState;
    }
}
