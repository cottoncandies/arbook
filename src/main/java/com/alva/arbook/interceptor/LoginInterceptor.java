package com.alva.arbook.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//            throws Exception {
//        HttpSession session = request.getSession();
//        if (session.getAttribute(sessionLoginUser) != null) {
//            return true;
//        } else {
//            String url = request.getContextPath() + "/login.html";
//            response.sendRedirect(url);
//            return false;
//        }
//    }
}
