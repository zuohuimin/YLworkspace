package cn.zhomp.action;

import cn.zhomp.entity.User;
import cn.zhomp.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("selectAll")
    @ResponseBody
    private List<User> selectUser(){
        return userService.selectUser();
    }
}
