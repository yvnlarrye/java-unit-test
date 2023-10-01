import org.junit.Test;

@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Expected true for age 18 and greater, but got false", true, isAdult);
}