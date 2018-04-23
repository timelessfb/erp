package edu.uestc.ssmdemo.service;

import edu.uestc.ssmdemo.entity.Userinfo;

public interface LoginService {
    public Userinfo verify(Userinfo userinfo);
}
