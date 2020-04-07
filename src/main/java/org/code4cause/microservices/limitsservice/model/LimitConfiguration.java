package org.code4cause.microservices.limitsservice.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author amipatil
 *
 */
@Component
@ConfigurationProperties(prefix = "limits")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LimitConfiguration {

	private Integer minimum;
	
	private Integer maximum;
}
