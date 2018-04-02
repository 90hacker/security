
package cn.xiaoyh.modules.oss.service;

import cn.xiaoyh.common.utils.PageUtils;
import cn.xiaoyh.modules.oss.entity.SysOssEntity;
import com.baomidou.mybatisplus.service.IService;


import java.util.Map;

/**
 * 文件上传
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-25 12:13:26
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
