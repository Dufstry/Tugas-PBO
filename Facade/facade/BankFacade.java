package TugasPresentasi.Facade.facade;

import TugasPresentasi.Facade.Entity.Account;
import TugasPresentasi.Facade.Repository.AccountRepository;

public class BankFacade {
    private AccountRepository accountRepository = new AccountRepository();

    public void transfer(String fromAccountNo, String toAccountNo, Long amount){
        Account account1 = accountRepository.findById(fromAccountNo);
        Account account2 = accountRepository.findById(toAccountNo);

        account1.setBalance(account1.getBalance() - amount);
        account2.setBalance(account2.getBalance() + amount);

        accountRepository.update(account1);
        accountRepository.update(account2);
    }

}

