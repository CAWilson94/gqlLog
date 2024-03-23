package com.example.worklog;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WorkItemLogController {
    @QueryMapping
    public WorkItemLog WorkItemLogById(@Argument String id){
        return WorkItemLog.getById(id);
    }

}
