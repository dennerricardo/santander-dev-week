package example.dio.domain.service;

import example.dio.domain.model.BankUser;

public interface UserService {

    BankUser findById(Long id);

    BankUser create(BankUser userToCreate) ;
}
