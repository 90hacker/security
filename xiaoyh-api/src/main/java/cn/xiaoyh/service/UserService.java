
package cn.xiaoyh.service;


import cn.xiaoyh.entity.UserEntity;
import cn.xiaoyh.form.LoginForm;
import com.baomidou.mybatisplus.service.IService;

import java.util.Map;

/**
 * 用户
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:22:06
 */
public interface UserService extends IService<UserEntity> {

    /**
     * 通过手机号码查询用户信息
     * @param mobile
     * @return
     */
	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回登录信息
	 */
	Map<String, Object> login(LoginForm form);
}
