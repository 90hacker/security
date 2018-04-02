package cn.xiaoyh.modules.sys.dao;

import cn.xiaoyh.modules.sys.entity.SysRoleMenuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;


import java.util.List;

/**
 * 角色与菜单对应关系
 *
 * @author 肖云惠
 * @email i@xiaoyh.cn
 * @date 2018/3/8 17:07
 */
public interface SysRoleMenuDao extends BaseMapper<SysRoleMenuEntity> {
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
