package Behavioral.state;

/**
 * Created by FrancescoXX on 26/05/2018.
 */
public class Client {

    public static void main(String[] args) throws Exception {

        TCPConnection connection = new TCPConnection();

        connection.open();
        connection.acknowledge();
        connection.close();
        //connection.acknowledge();
    }
}
