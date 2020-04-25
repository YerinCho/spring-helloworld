package wooteco.helloworld.core;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String retrieveUsers() {
        List<String> users = userService.findAll();
        return "found it";
    }

}
