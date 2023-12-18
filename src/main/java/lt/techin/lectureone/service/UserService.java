package lt.techin.lectureone.service;


import modal.request.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User capitalizeName(User user) {
        user.name = user.name.toUpperCase();
        System.out.println(user);
        return user;
    }
}


