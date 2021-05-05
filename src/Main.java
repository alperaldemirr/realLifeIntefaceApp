import Adapters.MernisServiceAdapter;
import customer.BaseCustomerManager;
import customer.Customer;
import customer.NeroCustomerManager;
import customer.StarbucksCustomerManager;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        Customer alper = new Customer(1, "Alper", "Aldemir", 2002,"27704615934");


        BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        baseCustomerManager.save(alper);
    }
}
