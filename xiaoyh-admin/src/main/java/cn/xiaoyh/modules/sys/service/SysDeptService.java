package cn.xiaoyh.modules.sys.service;


import cn.xiaoyh.modules.sys.entity.SysDeptEntity;
import com.baomidou.mybatisplus.service.IService;


import java.util.List;
import java.util.Map;

/**
 * 部门管理
 *
 * @author 肖云惠
 * @email i@xiaoyh.cn
 * @date 2018/3/8 17:07
 */
public interface SysDeptService extends IService<SysDeptEntity> {

	List<SysDeptEntity> queryList(Map<String, Object> map);

	/**
	 * 查询子部门ID列表
	 * @param parentId  上级部门ID
	 */
	List<Long> queryDetpIdList(Long parentId);

	/**
	 * 获取子部门ID，用于数据过滤
	 */
	List<Long> getSubDeptIdList(Long deptId);

}
