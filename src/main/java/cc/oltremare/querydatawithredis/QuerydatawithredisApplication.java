package cc.oltremare.querydatawithredis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("cc.oltremare.querydatawithredis.mapper")
public class QuerydatawithredisApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuerydatawithredisApplication.class, args);
	}

}
