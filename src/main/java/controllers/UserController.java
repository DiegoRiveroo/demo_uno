package controllers;

import com.server.demo_uno.dto.User;
import com.server.demo_uno.services.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("users")


public class UserController {
    private final UsersService usersService;

    @PostMapping(path = "/create", produces = "application/json")
    com.server.abdelmurserverdemo.entities.Users saveUser(@RequestBody User user) {
        return this.usersService.saveUser(user);
    }


}
