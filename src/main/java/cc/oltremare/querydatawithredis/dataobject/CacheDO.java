package cc.oltremare.querydatawithredis.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 此类为cache_test表的mybatis映射实体类
 * @author Oltremare
 * @time 2020/08/17
 */
@TableName(value="cache_test")
public class CacheDO implements Serializable {
    /**
     * 自增主键
     */
    private int id;

    /**
     * 存储的数值
     */
    @TableId
    private int value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
