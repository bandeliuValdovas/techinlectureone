package lt.techin.lectureone.controller;


import lombok.RequiredArgsConstructor;
import lt.techin.lectureone.service.UserService;
import modal.request.User;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequiredArgsConstructor
public class UserConroller {

    private UserService userService;

//    public UserConroller(UserService userService) {
//        this.userService = userService;
//    }




    @GetMapping
    public Object getUser() {
        return "qq";
    }



    @GetMapping("/dif")
    public Object getDifUser() {
        return "qqww";
    }

    @PostMapping
    public Object returnWhatWeRecive(
           @RequestParam String input
    ){
        return input;
    }


    @PostMapping("/body")
    public User tryPassBody(
            @RequestBody User body
    ){
        return userService.capitalizeName(body);
    }



}
