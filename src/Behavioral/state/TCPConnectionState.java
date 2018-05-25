package Behavioral.state;

/**
 * Created by FrancescoXX on 26/05/2018.
 */
public interface TCPConnectionState {

    void open();

    void close();

    void acknowledge() throws Exception;
}
