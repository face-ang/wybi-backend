package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.springbootinit.model.entity.User;
import generator.service.UserService;
import com.yupi.springbootinit.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2024-08-30 22:24:29
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




