package com.ll.exam.qsl.user.controller;

import com.ll.exam.qsl.user.entity.SiteUser;
import com.ll.exam.qsl.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @RequestMapping("/user/{id}")
    public SiteUser user(@PathVariable Long id) {
        return userService.getQslUser(id);
    }
}
