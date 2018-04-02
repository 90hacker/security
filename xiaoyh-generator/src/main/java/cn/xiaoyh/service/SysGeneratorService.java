package cn.xiaoyh.service;

import java.util.List;
import java.util.Map;

/**
 * @author 肖云惠
 * @email i@xiaoyh.cn
 * @date 2018/3/8 16:43
 */
public interface SysGeneratorService  {

    List<Map<String, Object>> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);

    byte[] generatorCode(String[] tableNames);
}
