package com.example.worklog;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public record WorkItemLog(
        String id,
        String date,
        String author,
        int estimatedLengthOfTime,
        int actualLengthOfTime,
        String workType,
        String department) {
    private static List<WorkItemLog> workItems = Arrays.asList(
            new WorkItemLog("01", "25 March 2024", "cha", 20, 40, "Meeting", "Deco"),
            new WorkItemLog("02", "25 March 2024", "cha", 30, 23, "Meeting", "UI"),
            new WorkItemLog("03", "25 March 2024", "cha", 20, 60, "Meeting", "Glasgow")
    );

    public static WorkItemLog getById(String id){
        return workItems.stream().filter(workItem -> workItem.id().equals(id)).findFirst().orElse(null);
    }

    public static List<WorkItemLog> getAll(){
        return workItems;
    }

}
