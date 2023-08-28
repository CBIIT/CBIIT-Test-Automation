package ServiceNow.CHARMS.alljava;

import java.util.ArrayList;
import java.util.Date;

public class ParticipantDemographic {
    private Date participantDateOfBirth;
    private int  participantAge;

    public Date getParticipantDateOfBirth() {
        return this.participantDateOfBirth;
    }

    public void setParticipantDateOfBirth(Date participantDateOfBirth) {
        this.participantDateOfBirth = participantDateOfBirth;
    }

    public int getParticipantAge() {
        return this.participantAge;
    }

    public void setParticipantAge(int participantAge) {
        this.participantAge = participantAge;
    }

    @SuppressWarnings("serial")
    public static final ArrayList<String> SEX_ASSIGNED_AT_BIRTH_LIST = new ArrayList<String>() {
        {
            add("Male");
            add("Female");
            add("Unknown/Unsure");
            add("Prefer not to answer");
        }
    };

    @SuppressWarnings("serial")
    public static final ArrayList<String> CURRENT_GENDER_IDENTITY = new ArrayList<String>() {
        {
            add("Female");
            add("Male");
            add("Transgender");
            add("I use a different term:");
            add("Unknown/Unsure");
            add("Prefer not to answer");
        };
    };

    public static final ArrayList<String> PRONOUNS = new ArrayList<String>() {
        {
            add("She/her");
            add("He/him");
            add("They/them");
            add("I use a different term:");
            add("Unknown/Unsure");
            add("Prefer not to answer");
        }
    };

    @SuppressWarnings("serial")
    public static final ArrayList<String> RACE = new ArrayList<String>() {
        {
            add("White");
            add("Black/African American");
            add("Native Hawaiian/Pacific Islander");
            add("American Indian/Alaskan Native");
            add("Asian");
            add("Other (please specify)");
            add("Unknown/Unsure");
        }
    };



    
}
