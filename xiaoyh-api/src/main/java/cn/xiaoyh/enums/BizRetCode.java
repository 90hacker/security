package cn.xiaoyh.enums;

/**
 * @author 肖云惠
 * @email i@xiaoyh.cn
 * @date 2018/3/13 13:15
 */
public enum BizRetCode {
    //登录的token为空异常！
    USER_TO_KEY_IS_NULL(-101,"token不能为空！"),
    //token失效或过期异常！
    USER_TO_KEY_MATURITY(-102,"token失效，请重新登录！"),
    //数据库中已存在该记录！
    RECORD_DATA_EXISTED(-103,"数据库中已存在该记录！");

    private int code;
    private String description;

    BizRetCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }
    public String getDescription() {
        return description;
    }

    /**
     * 根据值获取对应的枚举
     * @param value 枚举的数值
     * @return 成功返回相应的枚举，否则返回null。
     */
    public static BizRetCode parse(Integer value) {
        if (value != null) {
            BizRetCode[] array = values();
            for (BizRetCode each : array) {
                if (value == each.code) {
                    return each;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "BizRetCode{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }
}
