package com.example.worklog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WorkItemLogController {

    @Autowired
    private WorkItemLog workItemLog;

    @QueryMapping
    public WorkItemLog WorkItemLogById(@Argument String id){
        return WorkItemLog.getById(id);
    }

}
