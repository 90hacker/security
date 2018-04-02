package cn.xiaoyh.common.utils;

import java.util.HashMap;

/**
 * Map工具类
 * @author 肖云惠
 * @email i@xiaoyh.cn
 * @date 2018/3/8 15:04
 */
public class MapUtils extends HashMap<String, Object> {
    @Override
    public MapUtils put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
