# QueryDataWithRedis

此项目是基于Spring Boot与MyBatis-Plus以及Redis缓存的简单接口的实现,作为文章《Java
中缓存对于性能的影响初识》的实现项目，读者可以参照文章进行阅读，本项目也可直接运行，作为简单的接口实现进行阅读和再次开发。

## 项目导入

clone至本地以后，使用IDEA进行打开，即可正常运行。

## 使用

本项目只有一个接口，运行项目后，通过以下url进行访问
```url
http://localhost:8080/getCache/getCacheValue?id=1
```

可获得对应的JSON结果:

```json
{"value":1,"code":200}
```

## 许可
[MIT](https://choosealicense.com/licenses/mit/)
