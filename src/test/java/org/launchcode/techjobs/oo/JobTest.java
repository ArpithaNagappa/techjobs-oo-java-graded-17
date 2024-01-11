package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

@Test
    public void testSettingJobId(){
    Job job1 = new Job();
    Job job2 = new Job();
    assertNotEquals(job1.getId(),job2.getId());
}
@Test
    public void testJobConstructorSetsAllFields(){
    Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertEquals( "Product tester",newJob.getName());
    assertTrue(newJob.getName().equals("Product tester") );

    assertEquals(newJob.getEmployer().getValue(),"ACME");
    assertTrue(newJob.getEmployer()instanceof Employer);

    assertEquals(newJob.getLocation().getValue(),"Desert");
    assertTrue(newJob.getLocation()instanceof Location);

    assertEquals(newJob.getPositionType().getValue(),"Quality control");
    assertTrue(newJob.getPositionType() instanceof PositionType);

    assertEquals(newJob.getCoreCompetency().getValue(),"Persistence");
    assertTrue(newJob.getCoreCompetency()instanceof CoreCompetency);

    // assertTrue(newJob.getCoreCompetency() != null);
}
@Test
    public void testJobsForEquality() {
    Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(job3.equals(job4));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
    Job sJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String newLine = System.lineSeparator();
    String s = sJob.toString();
    assertEquals(s.charAt(0),newLine);
    assertEquals(s.charAt(s.length()-1),newLine);
 }
@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job stringJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String newLine = System.lineSeparator();
    String outPut =  newLine +
            "ID: " + stringJob.getId() + newLine +
            "Name: " + "Product tester" + newLine +
            "Employer: " + "ACME" + newLine +
            "Location: " + "Desert" + newLine +
            "Position Type: " + "Quality control" + newLine +
            "Core Competency: " + "Persistence" + newLine;
   assertEquals(stringJob.toString(),outPut);

    }
@Test
    public void testToStringHandlesEmptyField(){
    Job s1Job = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String newLine = System.lineSeparator();
    String nullOutput =  newLine +
            "ID: " + s1Job.getId() + newLine +
            "Name: " + "Product tester" + newLine +
            "Employer: " + "Data not available" + newLine +
            "Location: " + "Desert" + newLine +
            "Position Type: " + "Quality control" + newLine +
            "Core Competency: " + "Persistence" + newLine;
    assertEquals(s1Job.toString(),nullOutput);
}
@Test
    public  void testToStringHandlesAllEmptyField(){
    Job s1Job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    String newLine = "\n";
    String nullOutput =  "OOPS! This job does not seem to exist.";
    assertEquals(s1Job.toString(),nullOutput);

}

}

