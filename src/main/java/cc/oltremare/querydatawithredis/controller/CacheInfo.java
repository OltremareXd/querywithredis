package cc.oltremare.querydatawithredis.controller;

import cc.oltremare.querydatawithredis.dataobject.CacheDO;
import cc.oltremare.querydatawithredis.dataobject.Result;
import cc.oltremare.querydatawithredis.mapper.CacheMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 此类为访问获取cache表值的controller类
 * @author Oltremare
 * @time 2020/08/17
 */
@RestController
@RequestMapping("/cache")
public class CacheInfo {
    @Autowired
    CacheMapper cacheMapper;

    /**
     * 通过ID获取cache中的值
     * @param id id号
     * @return cache中的值
     */
    @GetMapping("/getCacheValue")
    public Result getCache(@RequestParam(name = "id") String id){
        CacheDO cacheDO = cacheMapper.selectById(id);
        // 如果没有查询到相关的值 则返回错误
        if (cacheDO == null) {
            return new Result() {{
                setCode(404);
                setValue(-1);
            }};
        }

        // 如果查询到结果了 则返回结果
        int result = cacheDO.getValue();
        return new Result() {{
            setValue(result);
        }};
    }
}
