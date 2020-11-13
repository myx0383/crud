package com.my.crud.controller;


import com.my.crud.common.lang.Result;
import com.my.crud.entity.User;
import com.my.crud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import sun.applet.resources.MsgAppletViewer;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2020-11-12
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public IUserService userService;

    @GetMapping("index")
    public Result index(){
        User byId = userService.getById("1");
        return Result.succ(byId);
    }

    @PostMapping("svae")
    public Result save(@Validated @RequestBody User user){
        return Result.succ("200","成功",user);
    }

}
