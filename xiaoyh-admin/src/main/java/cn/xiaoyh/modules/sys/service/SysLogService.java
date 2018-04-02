

package cn.xiaoyh.modules.sys.service;


import cn.xiaoyh.common.utils.PageUtils;
import cn.xiaoyh.modules.sys.entity.SysLogEntity;
import com.baomidou.mybatisplus.service.IService;

import java.util.Map;


/**
 * 系统日志
 *
 * @author 肖云惠
 * @email i@xiaoyh.cn
 * @date 2018/3/8 17:07
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
