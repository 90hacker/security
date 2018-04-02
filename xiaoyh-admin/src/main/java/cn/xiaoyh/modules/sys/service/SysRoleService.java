
package cn.xiaoyh.modules.sys.service;


import cn.xiaoyh.common.utils.PageUtils;
import cn.xiaoyh.modules.sys.entity.SysRoleEntity;
import com.baomidou.mybatisplus.service.IService;

import java.util.Map;


/**
 * 角色
 *
 * @author 肖云惠
 * @email i@xiaoyh.cn
 * @date 2018/3/8 17:07
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void save(SysRoleEntity role);

	void update(SysRoleEntity role);
	
	void deleteBatch(Long[] roleIds);

}
