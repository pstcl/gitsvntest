package org.pstcl.estimate.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@PropertySource("file:external.properties")
public class GlobalProperties {

	@Autowired
	private Environment environment;

	@Getter
	@Setter
	@Value("${admin.username}")
	private String adminUsername;

	@Getter
	@Setter
	@Value("${admin.password}")
	private String adminPassword;
	
	@Getter
	@Setter
	@Value("${node4.username}")
	private String node4Username;

	@Getter
	@Setter
	@Value("${node4.password}")
	private String node4Password;
	@Getter
	@Setter
	@Value("${node1.username}")
	private String node1Username;

	@Getter
	@Setter
	@Value("${node1.password}")
	private String node1Password;
	@Getter
	@Setter
	@Value("${node2.username}")
	private String node2Username;

	@Getter
	@Setter
	@Value("${node2.password}")
	private String node2Password;
	@Getter
	@Setter
	@Value("${node3.username}")
	private String node3Username;

	@Getter
	@Setter
	@Value("${node3.password}")
	private String node3Password;

	@Getter
	@Setter
	@Value("${user.username}")
	private String userUsername;

	@Getter
	@Setter
	@Value("${user.password}")
	private String userPassword;

	@Getter
	@Setter
	@Value("${url.protocol}")
	private String urlProtocol;
	@Getter
	@Setter
	@Value("${url.server}")
	private String server;
	@Getter
	@Setter
	@Value("${url.port}")
	private String port;
	@Getter
	@Setter
	@Value("${url.context}")
	private String context;
	@Getter
	@Setter
	@Value("${url.estimates.list}")
	private String estimateList;
	@Getter
	@Setter
	@Value("${url.estimate.details}")
	private String estimateDetails;

	public String urlEstimateDetailsByCode()
	{
	
		return urlProtocol+ "://"+server+":"+port+"/"+estimateDetails;
	}
	public String urlEstimateListUrl()
	{
	
		return urlProtocol+ "://"+server+":"+port+"/"+estimateList;
	}
	
}