package cn.maybe.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础实体类，存储公共属性
 *
 * @author sun_hming
 * @date 2024/04/04 10:53
 */
@Data
public class BaseEntity implements Serializable {
    public static final String PATTERN_DATETIME = "yyyy-MM-dd HH:mm:ss";
    /**
     * 主键id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 创建人
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long createUser;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = PATTERN_DATETIME)
    @JsonFormat(pattern = PATTERN_DATETIME)
    private Date createTime;

    /**
     * 更新人
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long updateUser;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = PATTERN_DATETIME)
    @JsonFormat(pattern = PATTERN_DATETIME)
    private Date updateTime;

    /**
     * 状态[1:正常]
     */
    private Integer status;

    /**
     * 状态[0:未删除,1:删除]
     */
    @TableLogic
    private Integer isDeleted;

}
