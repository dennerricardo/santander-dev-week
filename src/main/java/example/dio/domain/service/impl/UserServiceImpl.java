package example.dio.domain.service.impl;

import example.dio.domain.model.BankUser;
import example.dio.domain.repository.BankUserRepository;
import example.dio.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final BankUserRepository userRepository;

    public UserServiceImpl(BankUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public BankUser findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public BankUser create(BankUser userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
                throw new IllegalArgumentException("This account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
