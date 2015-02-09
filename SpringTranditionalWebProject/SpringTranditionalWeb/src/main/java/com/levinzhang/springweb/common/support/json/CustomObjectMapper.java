package com.levinzhang.springweb.common.support.json;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.module.SimpleModule;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;


@Component("customObjectMapper")
public class CustomObjectMapper extends ObjectMapper {
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		this.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		this.configure(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		this.configure(SerializationConfig.Feature.WRITE_NULL_MAP_VALUES, false);
		this.configure(SerializationConfig.Feature.WRITE_ENUMS_USING_TO_STRING, true);
		this.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, true);
		this.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
		this.configure(SerializationConfig.Feature.WRITE_EMPTY_JSON_ARRAYS, false);

		this.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);

		SimpleModule module = new SimpleModule("customObjectMapperConfig", new Version(1, 0, 0, null));
		module.addSerializer(BindingResult.class, new JsonSerializer<BindingResult>() {
			@Override
			public void serialize(BindingResult value, JsonGenerator jgen, SerializerProvider provider)
					throws IOException, JsonProcessingException {
				jgen.writeString(value.toString());
			}
		});

		this.registerModule(module);
	}
}