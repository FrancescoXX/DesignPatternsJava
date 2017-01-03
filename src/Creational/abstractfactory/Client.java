package Creational.abstractfactory;

/**
 * Created by FrancescoXX
 */
public class Client {

    /**
     * uses WidgetFactory
     * delegates to the initialize method
     * @param factory
     */

    public static void initializeGUI(WidgetFactory factory){
        initializeGUI(factory.createScrollbar(), factory.createWindow());
    }

    public static void initializeGUI(Scrollbar bar, Window window){
        System.out.println("Init logic here with " + bar.getClass().getName() + " and " + window.getClass().getName());
    }


    public static void main(String[] args) {

        /**
         * Lets create a new Widget for the Pink theme
         */
        WidgetFactory factory = new PinkThemeWidgetFactory();
        initializeGUI(factory);

        /**
         * lets change theme to Yellow one
         */
        factory = new YellowThemeWidgetFactory();
        initializeGUI(factory);
    }
}
