package com.supervisor.web.controller;

import com.atlassian.connect.spring.AtlassianHostRestClients;
import com.atlassian.connect.spring.AtlassianHostUser;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.util.concurrent.Promise;
import com.supervisor.atlassian.rest.MyJiraRestClientFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private AtlassianHostRestClients atlassianHostRestClients;

    @Autowired
    private MyJiraRestClientFactory jiraRestClientFactory;

    @RequestMapping(value = "/getIssue/{issueId}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> test(@AuthenticationPrincipal AtlassianHostUser user, @PathVariable String issueId) {
        RestTemplate restTemplate = atlassianHostRestClients.authenticatedAsAddon();
        JiraRestClient jiraRestClient = jiraRestClientFactory.createJiraRestClient(user.getHost(), restTemplate);
        Promise<Issue> issuePromise = jiraRestClient.getIssueClient().getIssue(issueId);
        Issue issue = issuePromise.claim();

        Map<String, String> result = new HashMap<>();
        result.put("issueKey", issue.getKey());
        result.put("name", issue.getSummary());
        result.put("value", issue.getDescription());
        return result;
    }

}
