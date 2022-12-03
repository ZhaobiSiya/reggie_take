package com.itheima.reggie.config;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.itheima.reggie.common.JacksonObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@Slf4j
@Configuration
public class WebMVCConfig extends MybatisConfiguration {
    //扩展mvc框架消息转换器

    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        log.info("消息转换器启用");
        //创建消息转换器对象
        MappingJackson2HttpMessageConverter MessageConverter = new MappingJackson2HttpMessageConverter();
        //设置对象转换器，底层用jackson将java对象转为jason
        MessageConverter.setObjectMapper(new JacksonObjectMapper());
        //将消息转换器对象追加到mvc框架的转换器容器中
        converters.add(0,MessageConverter);
    }

}
