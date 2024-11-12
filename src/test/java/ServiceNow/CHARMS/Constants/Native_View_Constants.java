package ServiceNow.CHARMS.Constants;

import java.util.ArrayList;
import java.util.List;

public class Native_View_Constants {

    /**
     * Subject Flags Columns
     */
    public static final List<String> subjectFlagsColumns = new ArrayList<>() {
        {
            add("Study");
            add("Participant");
            add("Participation Status");
            add("Eligible for Clinic");
            add("Age Group");
            add("Individual Affected Status");
            add("Individual Genetic Status");
        }
    };
}
