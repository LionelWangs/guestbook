package com.lionel.guestbook.modules.user.service.impl;

import com.lionel.guestbook.modules.user.entity.User;
import com.lionel.guestbook.modules.user.dao.UserMapper;
import com.lionel.guestbook.modules.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lionel
 * @since 2021-01-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
