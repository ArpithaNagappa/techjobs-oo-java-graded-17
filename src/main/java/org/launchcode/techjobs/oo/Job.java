package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        // return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
        return getId() == job.getId() &&
                getName() == job.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    //    @Override
//    public String toString() {
//        String newLine = System.lineSeparator();
//        return  newLine +
//                "ID: " + id + newLine +
//                "Name: " + (name == null ? "Data not available" : name) + newLine +
//                "Employer: " + (employer == null ? "Data not available" : employer) + newLine +
//                "Location: " + (location  == null ? "Data not available" : location) + newLine +
//                "Position Type: " + (positionType == null ? "Data not available" : positionType) + newLine +
//                "Core Competency: " + (coreCompetency == null ? "Data not available" : coreCompetency) + newLine ;
//    }
    @Override
    public String toString() {

        String newLine = "\n";//System.lineSeparator();
        String sname;
        String semployer;
        String slocation;
        String spositionType;
        String scoreCompetency;
        if(name.isEmpty()) sname = "Data not available"; else sname = name;
        if(employer.toString().isEmpty()) semployer = "Data not available"; else semployer = employer.toString();
        if(location.toString().isEmpty()) slocation = "Data not available"; else slocation = location.toString();
        if(positionType.toString().isEmpty()) spositionType = "Data not available"; else spositionType = positionType.toString();
        if(coreCompetency.toString().isEmpty()) scoreCompetency = "Data not available"; else scoreCompetency = coreCompetency.toString();
        if(name.isEmpty() &&  employer.toString().isEmpty() && location.toString().isEmpty()
                && positionType.toString().isEmpty()
                && coreCompetency.toString().isEmpty())
        {
            return "OOPS! This job does not seem to exist.";
        }
        else {
            return newLine +
                    "ID: " + id + newLine +
                    "Name: " + sname + newLine +
                    "Employer: " + semployer + newLine +
                    "Location: " + slocation + newLine +
                    "Position Type: " + spositionType + newLine +
                    "Core Competency: " + scoreCompetency + newLine;
        }
    }




    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
