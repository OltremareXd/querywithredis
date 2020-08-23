package cc.oltremare.querydatawithredis;

import cc.oltremare.querydatawithredis.mapper.CacheMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class QuerydatawithredisApplicationTests {
	@Autowired
	private CacheMapper mapper;

	@Test
	void contextLoads() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i ++){
			mapper.selectById(1);
		}
		Date end = new Date();// 获取当前时间
		System.out.println(System.currentTimeMillis() - start);
	}
}
