
package cn.xiaoyh.common.validator.group;

import javax.validation.GroupSequence;

/**
 * 定义校验顺序，如果AddGroup组失败，则UpdateGroup组不会再校验
 * @author 肖云惠
 * @email i@xiaoyh.cn
 * @date 2018/3/8 16:21
 */
@GroupSequence({AddGroup.class, UpdateGroup.class})
public interface Group {

}
