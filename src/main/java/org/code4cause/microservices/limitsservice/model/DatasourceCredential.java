package org.code4cause.microservices.limitsservice.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "db")
@Data
public class DatasourceCredential {

	private String username;
	
	private String password;
}
