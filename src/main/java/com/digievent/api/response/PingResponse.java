/**
 * 
 */
package com.digievent.api.response;
import java.util.Date;

/**
 * @author tsholofelo moema
 *
 */
public class PingResponse {
	
	private String environment;
	
	private String appName;

	public PingResponse(String environment, String appName) {
		super();
		this.environment = environment;
		this.appName = appName;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	

}
