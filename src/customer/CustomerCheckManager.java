package customer;

public class CustomerCheckManager implements CustomerCheckService{
    @Override
    public boolean checkIfRealPersonel(Customer customer) {
        return true;
    }
}
