package com.supervisor.web.controller;

import com.atlassian.connect.spring.AtlassianHostRestClients;
import com.atlassian.connect.spring.AtlassianHostUser;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.util.concurrent.Promise;
import com.supervisor.atlassian.rest.MyJiraRestClientFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private AtlassianHostRestClients atlassianHostRestClients;

    @Autowired
    private MyJiraRestClientFactory jiraRestClientFactory;

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping(value = "/getIssue/{issueId}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> test(@AuthenticationPrincipal AtlassianHostUser user, @PathVariable String issueId) {
        RestTemplate restTemplate = atlassianHostRestClients.authenticatedAsAddon();
        JiraRestClient jiraRestClient = jiraRestClientFactory.createJiraRestClient(user.getHost(), restTemplate);
        Promise<Issue> issuePromise = jiraRestClient.getIssueClient().getIssue(issueId);
        Issue issue = issuePromise.claim();


//        String devFilterJQL = "assignee in (%s) AND status in (\"Dev in Progress\", \"In Progress\") ORDER BY created DESC";
//        String format = String.format(devFilterJQL, usersJoined);

//        SearchResult claim = jiraRestClient.getSearchClient().searchJql(format).claim();
//        Iterable<Issue> issues = claim.getIssues();
//        Map<String, Issue> map = new HashMap<>();
//        for (Issue issue1 : issues) {
//            User assignee = issue.getAssignee();
//            if (assignee != null) {
//                String name = assignee.getName();
//                map.put(name, issue1);
//            }
//        }

        Map<String, String> result = new HashMap<>();
        result.put("issueKey", issue.getKey());
        result.put("name", issue.getSummary());
        result.put("value", issue.getDescription());
        return result;
    }

}
