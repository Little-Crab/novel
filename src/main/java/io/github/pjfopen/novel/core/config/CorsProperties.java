package io.github.pjfopen.novel.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * className: CorsProperties
 * description: 跨域配置属性
 *
 * @author pjf
 * date: 2022/5/25
 **/
@Data
@Component
@ConfigurationProperties(prefix = "novel.cors")
public class CorsProperties {
    /**
     * 允许跨域的域名
     */
    private List<String> allowOrigins;
}