package com.smj.entity;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * 自定义返回JSON 数据格式中日期格式化处理
* @ClassName: CustomDateSerializer 
* @author smj
* @date 2021年2月10日 下午19:18:14
*
 */
public class CustomDateSerializer extends JsonSerializer<Date>{

	@Override
	public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		gen.writeString(sdf.format(value));  
	}

}
