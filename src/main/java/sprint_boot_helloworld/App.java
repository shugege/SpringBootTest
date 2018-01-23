package sprint_boot_helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App /*extends WebMvcConfigurerAdapter*/{
	
    public static void main( String[] args ) {
    	SpringApplication.run(App.class, args);
    }

//	@Override
//	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		// TODO Auto-generated method stub
//		super.configureMessageConverters(converters);
//		//1.需要定义一个convert转换消息的对象
//		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//		//2.添加fastJson的配置信息,比如：是否要格式化返回的JSON数据
//		FastJsonConfig fastJsonConfig = new FastJsonConfig();
//		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//		
//		//3.在convert中添加配置信息
//		fastConverter.setFastJsonConfig(fastJsonConfig);
//		
//		//4.将convert添加到 converters中
//		converters.add(fastConverter);
//		
//	}
    
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConberters() {
    	
    	//1.需要定义一个convert转换消息的对象
    	FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
    	
    	//2.添加fastJson的配置信息,比如：是否要格式化返回的JSON数据
    	FastJsonConfig fastJsonConfig = new FastJsonConfig();
    	fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
    	
    	//3.在convert中添加配置信息
    	fastConverter.setFastJsonConfig(fastJsonConfig);
    	
    	HttpMessageConverter<?> converter = fastConverter;
    	
    	return new HttpMessageConverters(converter);
    	
    }
    
    
}
