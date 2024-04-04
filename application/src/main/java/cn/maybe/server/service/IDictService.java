package cn.maybe.server.service;

import cn.maybe.server.entity.DictEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 系统字典接口服务
 *
 * @author sun_hming
 * @date 2024/04/04 11:42
 */
public interface IDictService extends IService<DictEntity> {

    /**
     * 获取全部字典
     * @author sun_hming
     * @return List<DictEntity>
     * @date 2024/4/4 11:44
     */
    List<DictEntity> listDict();

}
