import models.Menu;
import models.Season;
import utils.CommonUtils;

import java.text.SimpleDateFormat;
public class Main {

    public static Menu menu = new Menu();

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Enter date with the order: DAY-MONTH-YEAR");
        String dateInput = CommonUtils.scannerInput.nextLine();
        Season season = Controller.getSeason(dateFormat, dateInput);
        Controller.getMenu(season);
    }

}

