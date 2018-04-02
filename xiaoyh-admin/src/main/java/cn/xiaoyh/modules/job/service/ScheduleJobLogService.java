package cn.xiaoyh.modules.job.service;

import cn.xiaoyh.common.utils.PageUtils;
import cn.xiaoyh.modules.job.entity.ScheduleJobLogEntity;
import com.baomidou.mybatisplus.service.IService;


import java.util.Map;

/**
 * 定时任务日志
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.2.0 2016-11-28
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
