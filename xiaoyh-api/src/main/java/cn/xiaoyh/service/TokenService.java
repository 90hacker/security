

package cn.xiaoyh.service;

import cn.xiaoyh.entity.TokenEntity;
import com.baomidou.mybatisplus.service.IService;


/**
 * 用户Token
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:22:07
 */
public interface TokenService extends IService<TokenEntity> {
    /**
     * 通过token查询用户信息
     * @param token
     * @return
     */
	TokenEntity queryByToken(String token);

	/**
	 * 生成token
	 * @param userId  用户ID
	 * @return        返回token信息
	 */
	TokenEntity createToken(long userId);

	/**
	 * 设置token过期
	 * @param userId 用户ID
	 */
	void expireToken(long userId);

}
