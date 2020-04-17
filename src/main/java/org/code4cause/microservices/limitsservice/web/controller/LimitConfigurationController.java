package org.code4cause.microservices.limitsservice.web.controller;

import org.code4cause.microservices.limitsservice.model.DatasourceCredential;
import org.code4cause.microservices.limitsservice.model.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

/**
 * 
 * @author amipatil
 *
 */
@RestController
@AllArgsConstructor
public class LimitConfigurationController {

	private LimitConfiguration limitConfiguration;

	private DatasourceCredential datasourceCredential;

	/**
	 * Provides Limits
	 * 
	 * @return {@link LimitConfiguration}
	 */
	@GetMapping(path = { "/limits" }, produces = { "application/json" })
	public LimitConfiguration limitConfigurationHandler() {
		return limitConfiguration;
	}

	/**
	 * Provides DataSourceCredentials from config server (stored in vault backend)
	 * 
	 * @return
	 */
	@GetMapping(path = { "/db-creds" }, produces = { "application/json" })
	public DatasourceCredential dataSourceCredentialsHandler() {
		return datasourceCredential;
	}

}
