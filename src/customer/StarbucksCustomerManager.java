package customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if (customerCheckService.checkIfRealPersonel(customer)) {
            System.out.println("Gecerli bir kullanici.");
        }else{
            System.out.println("Gecerli bir kullanici degil.");
        }
    }
}
