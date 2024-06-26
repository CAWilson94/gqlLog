package com.example.worklog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class WorkItemLogController {

    @QueryMapping
    public WorkItemLog WorkItemLogById(@Argument String id){
        return WorkItemLog.getById(id);
    }

    @QueryMapping
    public List<WorkItemLog> AllWorkItemLogs(){
        return WorkItemLog.getAll();
    }

}
