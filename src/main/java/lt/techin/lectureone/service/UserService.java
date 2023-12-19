package lt.techin.lectureone.service;


import modal.request.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {

    public User capitalizeName(User user) {
        System.out.println(user);
        return user;

    }


    public void doSth(String[] args) {
        List<User> userList = List.of(
                User.builder()
                        .withId(1)
                        .build(),
                User.builder()
                        .withId(2)
                        .build(),
                User.builder()
                        .withId(3)
                        .build());


        System.out.println(
                userList.stream()
                        .filter((currentUser) -> currentUser.getId() % 2 == 0)
                        .map((currentUser) -> {
                            currentUser.setName("Name" + currentUser.getId());
                            return currentUser;
                        })
                        .collect(Collectors.toList())
        );

    }
}




