package edu.uestc.ssmdemo.service.impl;

import edu.uestc.ssmdemo.dao.UserinfoMapper;
import edu.uestc.ssmdemo.entity.Userinfo;
import edu.uestc.ssmdemo.entity.UserinfoExample;
import edu.uestc.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserinfoMapper userinfoMapper;

    public Userinfo login(Userinfo user) {
        UserinfoExample example = new UserinfoExample();
        UserinfoExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(user.getName());
        criteria.andPasswordEqualTo(user.getPassword());
        List<Userinfo> sysUsers = userinfoMapper.selectByExample(example);
        if (sysUsers != null && sysUsers.size() >= 1){
            return sysUsers.get(0);
        }
        return null;
    }
}
