package cn.xiaoyh.interceptor;

import cn.xiaoyh.annotation.Login;
import cn.xiaoyh.common.exception.RRException;
import cn.xiaoyh.entity.TokenEntity;

import cn.xiaoyh.enums.BizRetCode;
import cn.xiaoyh.service.TokenService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 权限(Token)验证
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:38
 */
@Component
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    private TokenService tokenService;

    public static final String USER_KEY = "userId";
    public static final String TO_KEN = "token";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Login annotation;
        if(handler instanceof HandlerMethod) {
            annotation = ((HandlerMethod) handler).getMethodAnnotation(Login.class);
        }else{
            return true;
        }

        if(annotation == null){
            return true;
        }

        //从header中获取token
        String token = request.getHeader(TO_KEN);
        //如果header中不存在token，则从参数中获取token
        if(StringUtils.isBlank(token)){
            token = request.getParameter(TO_KEN);
        }

        //token为空
        if(StringUtils.isBlank(token)){
            throw new RRException(BizRetCode.USER_TO_KEY_IS_NULL.getDescription()
            ,BizRetCode.USER_TO_KEY_IS_NULL.getCode());
        }

        //查询token信息
        TokenEntity tokenEntity = tokenService.queryByToken(token);
        if(tokenEntity == null || tokenEntity.getExpireTime().getTime() < System.currentTimeMillis()){
            throw new RRException(BizRetCode.USER_TO_KEY_MATURITY.getDescription(),BizRetCode.USER_TO_KEY_MATURITY.getCode());
        }

        //设置userId到request里，后续根据userId，获取用户信息
        request.setAttribute(USER_KEY, tokenEntity.getUserId());

        return true;
    }
}
