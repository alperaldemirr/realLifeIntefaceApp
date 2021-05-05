package Adapters;

import customer.Customer;
import customer.CustomerCheckService;
import mernisReference.VGIKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPersonel(Customer customer) throws Exception {
        VGIKPSPublicSoap client = new VGIKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getBirthYear());
    }
}
