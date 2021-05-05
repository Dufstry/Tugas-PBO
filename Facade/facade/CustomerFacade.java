package TugasPresentasi.Facade.facade;

import TugasPresentasi.Facade.Entity.Address;
import TugasPresentasi.Facade.Entity.Customer;
import TugasPresentasi.Facade.Repository.AddressRepository;
import TugasPresentasi.Facade.Repository.CustomerRepository;

public class CustomerFacade {

    private CustomerRepository customerRepository = new CustomerRepository();

    private AddressRepository addressRepository = new AddressRepository();

    public void save(Customer customer){
        customerRepository.save(customer);

        for(Address address : customer.getAddresses()){
            addressRepository.save(address);
        }
    }
}
