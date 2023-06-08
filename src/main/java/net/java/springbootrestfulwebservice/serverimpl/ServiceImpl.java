package net.java.springbootrestfulwebservice.serverimpl;

import lombok.AllArgsConstructor;
import net.java.springbootrestfulwebservice.entity.User;
import net.java.springbootrestfulwebservice.repository.UserRepository;
import net.java.springbootrestfulwebservice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        User getUser = userRepository.findById(id).get();

        return getUser;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User existUser = userRepository.findById(user.getId()).get();
        existUser.setUserFirstName(user.getUserFirstName());
        existUser.setUserLastName(user.getUserLastName());
        existUser.setEmail(user.getEmail());


        return userRepository.save(existUser);
    }

    public void deleteUser(Long id){
        User user = userRepository.findById(id).get();

        userRepository.deleteById(id);
    }
}
