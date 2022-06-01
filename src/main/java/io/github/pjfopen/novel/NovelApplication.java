package io.github.pjfopen.novel;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@Slf4j
@EnableCaching
@SpringBootApplication
@MapperScan("io.github.pjfopen.novel.dao.mapper")
public class NovelApplication {

    public static void main(String[] args) {
        SpringApplication.run(NovelApplication.class, args);
    }

}