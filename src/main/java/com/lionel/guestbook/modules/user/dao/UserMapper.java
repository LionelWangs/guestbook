package com.lionel.guestbook.modules.user.dao;

import com.lionel.guestbook.modules.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Lionel
 * @since 2021-01-03
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
