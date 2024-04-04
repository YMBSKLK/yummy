package cn.maybe.server.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 系统字典类
 *
 * @author sun_hming
 * @date 2024/04/04 11:16
 */
@Data
@TableName("yummy_dict")
@EqualsAndHashCode(callSuper = true)
public class DictEntity extends BaseEntity {

    /*
     * 父级id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long parentId;

    /*
     * 字典编码
     */
    private String dictCode;

    /*
     * 键
     */
    private String dictKey;

    /*
     * 值
     */
    private String dictValue;

    /*
     * 顺序
     */
    private Integer sort;

    /*
     * 备注
     */
    private String remark;

}
