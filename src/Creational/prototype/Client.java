package Creational.prototype;

/**
 * Created by FrancescoXX on 05/01/17.
 */

public class Client {
    public static void main(String[] args) {

        Image image = new Image();
        image.setUrl("www.test.com");

        //graphictool instantiated by prototype
        GraphicTool tool = new GraphicTool(image);
        Graphic graphic = tool.createGraphic();
        //What type of graphic will be created?
        System.out.println("Graphic instance " + graphic.getClass()); //image
        System.out.println("Graphic url " + graphic.getUrl()); //image
        //change image url at runtime
        image.setUrl("newurl.com");

        //change the state
        graphic = tool.createGraphic();
        System.out.println("Graphic url " + graphic.getUrl()); //image




        //to have a video, must instantiate a new prototype
        Video video = new Video();
        video.setUrl("www.video.com");
        tool.setPrototype(video);
        graphic = tool.createGraphic();
        System.out.println("Graphic instance " + graphic.getClass()); //image
        System.out.println("Graphic url " + graphic.getUrl()); //image


    }
}
