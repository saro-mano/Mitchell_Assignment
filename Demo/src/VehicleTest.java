import junit.framework.TestCase;

public class VehicleTest extends TestCase {
    Vehicle v = new Vehicle("M3", 2, 2020, "BMW");

    public VehicleTest() throws Exception {
    }

    public void testGetId() {
        assertEquals(v.getId(),2);
    }

    public void testGetYear() {
        assertEquals(v.getYear(),2020);
    }

    public void testGetMake() {
        assertEquals(v.getMake(),"BMW");
    }

    public void testGetModel() {
        assertEquals(v.getModel(),"M3");
    }

    public void testSetId() {
        v.setId(2);
    }

    public void testSetYear() throws Exception {
        v.setYear(2020);
    }

    public void testSetMake() throws Exception {
        v.setMake("BMW");
    }

    public void testSetModel() throws Exception {
        v.setModel("M3");
    }
}