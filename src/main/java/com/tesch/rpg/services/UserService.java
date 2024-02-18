package com.tesch.rpg.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tesch.rpg.dtos.SheetDTO;
import com.tesch.rpg.dtos.UserDTO;
import com.tesch.rpg.entities.User;
import com.tesch.rpg.exceptions.IncorrectPasswordException;
import com.tesch.rpg.exceptions.UserNotRegisteredException;
import com.tesch.rpg.exceptions.UsernameAlreadyInUserException;
import com.tesch.rpg.repositories.IUserRepository;

@Service
public class UserService {
    
    @Autowired
    private IUserRepository userRepository;
    
    @Transactional
    public Long registerUser(UserDTO userDTO) {

        Optional<User> registeredUser = this.userRepository.findByLogin(userDTO.getLogin());

        if (registeredUser.isPresent()) {
            throw new UsernameAlreadyInUserException("O nome de usuário ja está em uso");
        }

        User user = User
            .builder()
                .login(userDTO.getLogin())
                .password(userDTO.getPassword())
                .sheet(SheetDTO.toSheet(userDTO.getSheetDTO()))
            .build();

        user = this.userRepository.save(user);

        return user.getId();
    }

    public SheetDTO loginUser(UserDTO userDTO) {

        Optional<User> registeredUser = this.userRepository.findByLogin(userDTO.getLogin());

        if (!registeredUser.isPresent()) {
            throw new UserNotRegisteredException("Nome de usuário não encontrado");
        }
        if (!registeredUser.get().getPassword().equals(userDTO.getPassword())) {
            throw new IncorrectPasswordException("Senha incorreta");
        }

        return SheetDTO.fromSheet(registeredUser.get().getSheet());
    }
}
