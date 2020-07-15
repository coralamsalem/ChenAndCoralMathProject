import Controller.HomePageController;
import Viewer.HomePage;

public class Runner
{


    public static void main(String[] args)
    {
        HomePage homePage= new HomePage();
        HomePageController view = new HomePageController(homePage);
        homePage.setVisible(true);

    }
}
