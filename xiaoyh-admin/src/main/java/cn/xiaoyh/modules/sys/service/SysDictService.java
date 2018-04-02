package cn.xiaoyh.modules.sys.service;

import cn.xiaoyh.common.utils.PageUtils;
import cn.xiaoyh.modules.sys.entity.SysDictEntity;
import com.baomidou.mybatisplus.service.IService;

import java.util.Map;

/**
 * 数据字典
 * @author 肖云惠
 * @email i@xiaoyh.cn
 * @date 2018/3/8 17:07
 */
public interface SysDictService extends IService<SysDictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

