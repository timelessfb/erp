package edu.uestc.ssmdemo.serviceimpl;

import edu.uestc.ssmdemo.dao.UserinfoMapper;
import edu.uestc.ssmdemo.entity.Userinfo;
import edu.uestc.ssmdemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserinfoMapper userinfoMapper;

    @Override
    public Userinfo verify(Userinfo user) {
        Userinfo userinfo = userinfoMapper.selectByPrimaryKey(user.getPhoneno());
        if (userinfo != null) {
            if (userinfo.getPassword().equals(userinfo.getPassword())) {
                return userinfo;
            }
            return null;
        }
        return null;
    }
}
