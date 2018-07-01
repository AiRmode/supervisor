package com.supervisor.atlassian.rest;

import com.atlassian.connect.spring.AtlassianHost;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import org.springframework.web.client.RestTemplate;

public interface MyJiraRestClientFactory {
    JiraRestClient createJiraRestClient(AtlassianHost host, RestTemplate restTemplate);
}
