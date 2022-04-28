import models.Menu;
import utils.CommonUtils;

import java.text.SimpleDateFormat;
public class Main {

    public static Menu menu = new Menu();

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Enter date with the order: DAY-MONTH-YEAR");
        String dateInput = CommonUtils.scannerInput.nextLine();
        Controller.getMenu(dateFormat, dateInput);
    }

}

