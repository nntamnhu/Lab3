package nguyenngoctamnhu.Lab3.services;

import nguyenngoctamnhu.Lab3.entity.User;
import nguyenngoctamnhu.Lab3.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    public void save(User user) {
        userRepository.save(user);
    }
}
