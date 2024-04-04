package cn.maybe.server.service.impl;

import cn.maybe.server.entity.DictEntity;
import cn.maybe.server.mapper.DictMapper;
import cn.maybe.server.service.IDictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DictServiceImpl extends ServiceImpl<DictMapper, DictEntity> implements IDictService {

    private final DictMapper dpDictMapper;

    @Override
    public List<DictEntity> listDict() {
        return dpDictMapper.getAllDict();
    }

}
