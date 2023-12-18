package lt.techin.lectureone.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UserConroller {

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




}
