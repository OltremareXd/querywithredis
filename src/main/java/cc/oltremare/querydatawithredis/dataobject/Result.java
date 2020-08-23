package cc.oltremare.querydatawithredis.dataobject;

/**
 * 描述接口返回对象
 * @author Oltremare
 * @time 2020/08/17
 */
public class Result {
    /* 查询结果值 */
    private int value;

    /**
     *  结果码
     *  默认成功为200
     **/
    private int code = 200;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
