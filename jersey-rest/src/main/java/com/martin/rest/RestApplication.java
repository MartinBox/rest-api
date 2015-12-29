package com.martin.rest;

 
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.moxy.json.MoxyJsonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * REST 主应用
 * 
 * @author waylau.com
 * 2015年3月3日
 */
public class RestApplication extends ResourceConfig {

	 public RestApplication() {  

	     //服务类所在的包路径  
	     packages("com.martin.rest.resource");  
	     //注册 MultiPart
		 register(MultiPartFeature.class);
	     //注册 JSON 转换器  
	     register(MoxyJsonFeature.class);
	     // 输入请求日志。生产环境可以去掉
	     register(LoggingFilter.class);
	    } 
}
