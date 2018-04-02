
package cn.xiaoyh.modules.sys.service;

import cn.xiaoyh.modules.sys.entity.SysRoleDeptEntity;
import com.baomidou.mybatisplus.service.IService;


import java.util.List;


/**
 * 角色与部门对应关系
 *
 * @author 肖云惠
 * @email i@xiaoyh.cn
 * @date 2018/3/8 17:07
 */
public interface SysRoleDeptService extends IService<SysRoleDeptEntity> {
	
	void saveOrUpdate(Long roleId, List<Long> deptIdList);
	
	/**
	 * 根据角色ID，获取部门ID列表
	 */
	List<Long> queryDeptIdList(Long[] roleIds) ;

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
