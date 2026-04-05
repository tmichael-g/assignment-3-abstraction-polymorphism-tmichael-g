import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.*;
import java.util.ArrayList;

public class SmartHomeTest {

    @Test
    public void testIsAbstract() {
        assertTrue(Modifier.isAbstract(SmartDevice.class.getModifiers()), 
            "SmartDevice class must be declared as 'abstract'.");
    }

    @Test
    public void testHasAbstractMethod() throws NoSuchMethodException {
        Method method = SmartDevice.class.getDeclaredMethod("activate");
        assertTrue(Modifier.isAbstract(method.getModifiers()), 
            "The activate() method in SmartDevice must be 'abstract'.");
    }

    @Test
    public void testSmartLightLogic() {
        SmartLight light = new SmartLight("Desk Lamp");
        // We capture console output or check internal state
        // For average students, checking if the object initializes correctly is a start
        assertEquals("Desk Lamp", light.getName(), "SmartLight should inherit name correctly.");
    }

    @Test
    public void testSmartThermostatLogic() {
        SmartThermostat therm = new SmartThermostat("Nest");
        assertNotNull(therm, "SmartThermostat should be implementable.");
    }

    @Test
    public void testPrivateFields() {
        Field[] fields = SmartDevice.class.getDeclaredFields();
        for (Field f : fields) {
            assertTrue(Modifier.isPrivate(f.getModifiers()), 
                "Field " + f.getName() + " must be private for Encapsulation.");
        }
    }

    @Test
    public void testMainUsesPolymorphicList() throws Exception {
        // This checks if the student is using the Parent type in their List
        // It's a "soft" check for the presence of ArrayList<SmartDevice>
        String content = java.nio.file.Files.readString(java.nio.file.Paths.get("src/Main.java"));
        assertTrue(content.contains("ArrayList<SmartDevice>") || content.contains("List<SmartDevice>"), 
            "Main.java should use a polymorphic List of SmartDevice.");
    }
}
