package Structural.Adapter;

/**
 * Created by FrancescoXX on 07/01/17.
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        //Create legacy rectangle
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        LegacyRectangleAdapter adapter = new LegacyRectangleAdapter(legacyRectangle); //pass the old reference

        //this is a client using the old rectangle
        client.calculateRectangleSize(adapter);
    }

    public void calculateRectangleSize(Rectangle rectangle){
        System.out.println("Rectangle size: " + rectangle.determineSize());
    }
}
