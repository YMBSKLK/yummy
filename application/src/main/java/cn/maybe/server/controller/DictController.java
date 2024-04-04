package cn.maybe.server.controller;

import cn.maybe.server.entity.DictEntity;
import cn.maybe.server.service.IDictService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 系统字典controller
 *
 * @author sun_hming
 * @date 2024/04/04 11:55
 */
@RestController
@RequestMapping("/dict")
@AllArgsConstructor
public class DictController {

    private final IDictService dictService;

    @GetMapping("/test")
    public List<DictEntity> listDict(){
        System.out.printf("123");
        return dictService.listDict();
    }

}
