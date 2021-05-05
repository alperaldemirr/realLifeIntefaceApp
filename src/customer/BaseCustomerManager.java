package customer;

public abstract class BaseCustomerManager implements CustomerService{
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Veritabanina Kayit Edildi: " + customer.getFirstName());
    }
}
