package org.code4cause.microservices.limitsservice.web.controller;

import org.code4cause.microservices.limitsservice.model.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author amipatil
 *
 */
@RestController
public class LimitConfigurationController {

	private LimitConfiguration limitConfiguration;

	public LimitConfigurationController(LimitConfiguration limitConfiguration) {
		this.limitConfiguration = limitConfiguration;
	}

	/**
	 * Provides Limits
	 * 
	 * @return {@link LimitConfiguration}
	 */
	@GetMapping(path = { "/limits" }, produces = { "application/json" })
	public LimitConfiguration limitConfigurationHandler() {
		return limitConfiguration;
	}

}
