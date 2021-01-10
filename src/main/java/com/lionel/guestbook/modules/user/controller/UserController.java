package com.lionel.guestbook.modules.user.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lionel.guestbook.config.Result;
import com.lionel.guestbook.modules.user.dao.UserMapper;
import com.lionel.guestbook.modules.user.entity.User;
import com.lionel.guestbook.modules.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.nio.channels.UnresolvedAddressException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Lionel
 * @since 2021-01-03
 */
@RestController
@RequestMapping("/user/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    /**
     * 查询所有用户
     * */
    @GetMapping("userList")
    public Result userList(Integer index , Integer size ) {
        if (index == 0) {
            index = 1 ;
        }
        if (size == 0) {
            size = 10 ;
        }
        IPage<User> userIPage = new Page<>(index,size);
        IPage<User> userList = userMapper.selectPage(userIPage, null);
        return Result.create(userList);
    }
}

