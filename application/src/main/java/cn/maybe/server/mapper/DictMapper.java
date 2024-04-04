package cn.maybe.server.mapper;

import cn.maybe.server.entity.DictEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 系统字典mapper
 *
 * @author sun_hming
 * @date 2024/04/04 11:42
 */
@Mapper
public interface DictMapper extends BaseMapper<DictEntity> {

    /**
     * 获取全部字典
     * @author sun_hming
     * @return List<DictEntity>
     * @date 2024/4/4 11:42
     */
    List<DictEntity> getAllDict();
}
