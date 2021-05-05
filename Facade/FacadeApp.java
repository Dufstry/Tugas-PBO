package TugasPresentasi.Facade;

import TugasPresentasi.Facade.Entity.Address;
import TugasPresentasi.Facade.Entity.Customer;
import TugasPresentasi.Facade.facade.BankFacade;
import TugasPresentasi.Facade.facade.CustomerFacade;

public class FacadeApp {
    public static void main(String[] args) {

        Customer customer = new Customer("1", "Malik");

        Address address1 = new Address("1", "Banjarbaru", "Indonesia");
        Address address2 = new Address("2", "Balikpapan", "Indonesia");

        customer.getAddresses().add(address1);
        customer.getAddresses().add(address2);

        CustomerFacade customerFacade = new CustomerFacade();
        customerFacade.save(customer);

        // ===========================

        BankFacade bankFacade = new BankFacade();
        bankFacade.transfer("0001", "0002", 1000000L);
        bankFacade.transfer("0003", "0004", 500000L);
    }

}

