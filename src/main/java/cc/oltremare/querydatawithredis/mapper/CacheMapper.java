package cc.oltremare.querydatawithredis.mapper;

import cc.oltremare.querydatawithredis.dataobject.CacheDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * 缓存实体的MyBatis Plus映射操作类
 * 由于这里的Demo没有业务需求和其他复杂逻辑
 * 所以后面的代码直接使用Mapper进行数据库操作
 * @author Oltremare
 * @time 2020/08/17
 */
@Repository
@CacheConfig(cacheNames = "cache")
public interface CacheMapper extends BaseMapper<CacheDO> {
    @Cacheable(key = "#id")
    CacheDO selectById(Integer id);
}
