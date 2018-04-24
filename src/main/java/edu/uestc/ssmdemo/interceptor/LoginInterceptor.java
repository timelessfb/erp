package edu.uestc.ssmdemo.interceptor;

import edu.uestc.ssmdemo.entity.Userinfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

public class LoginInterceptor  implements HandlerInterceptor{
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String[] URL = new String[]{"home_page"};
        String url = httpServletRequest.getRequestURI();
        url = url.substring(5);
        //System.out.println(url + "   " + url.substring(5));
        if (Arrays.asList(URL).contains(url)){
            HttpSession httpSession = httpServletRequest.getSession();
            if(httpSession.getAttribute("user") != null){
                Userinfo user = (Userinfo) httpSession.getAttribute("user");
                System.out.println("拦截器：" + user.getName() + " " + user.getPassword());
                return true;
            }
            httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/login/login.jsp").forward(httpServletRequest,httpServletResponse);
            return false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
