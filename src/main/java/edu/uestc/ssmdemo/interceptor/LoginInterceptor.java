package edu.uestc.ssmdemo.interceptor;

import edu.uestc.ssmdemo.entity.Userinfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor  implements HandlerInterceptor{
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String[] ignoreURI = new String[]{"login"};
        String url = httpServletRequest.getRequestURI();
        boolean loginFlag = false;
        for(String s: ignoreURI){
            if(url.contains(s)){
                loginFlag = true;
                break;
            }
        }
        if (!loginFlag){
            HttpSession httpSession = httpServletRequest.getSession();
            if(httpSession.getAttribute("user") != null){
                Userinfo user = (Userinfo) httpSession.getAttribute("user");
//                System.out.println("拦截器：" + user.getUserPhoneno() + " " + user.getUserPhoneno());
                loginFlag = true;
            }else {
                httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/login/login.jsp").forward(httpServletRequest,httpServletResponse);
            }
        }
        return loginFlag;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
