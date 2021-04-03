package factory.method;

import java.util.Calendar;

public class FactoryMethodEveryDayDemo {

    public static void main(String[] args) {

        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));

    }
}
