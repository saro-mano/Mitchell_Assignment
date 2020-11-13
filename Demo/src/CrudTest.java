import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;

public class CrudTest extends TestCase {

    private static HashMap<Integer, Vehicle> byId = new HashMap<>();
    public void testCreate() throws Exception {
        Vehicle obj = new Vehicle("model",1,2020,"make");
        //By ID {Assuming ID's are always unique}
        byId.put(1,obj);
    }

    public void testGet() {
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Integer id : byId.keySet()){
            Vehicle obj = byId.get(id);
            result.add(obj);
        }
    }

    public void testGetByYear() {
        int year = 2020;
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Integer id : byId.keySet()){
            Vehicle obj = byId.get(id);
            if (obj.getYear() == year){
                result.add(obj);
            }
        }
        if (result.size() == 0){
            System.out.println("No item to get");
        }
    }

    public void testGetByModel() {
        String model = "model";
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Integer id : byId.keySet()){
            Vehicle obj = byId.get(id);
            if (obj.getModel() == model){
                result.add(obj);
            }
        }
        if (result.size() == 0){
            System.out.println("No item to get");
        }
    }

    public void testGetByMake() {
        String make = "make";
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Integer id : byId.keySet()){
            Vehicle obj = byId.get(id);
            if (obj.getMake() == make){
                result.add(obj);
            }
        }
        if (result.size() == 0){
            System.out.println("No item to get");
        }
    }

    public void testGetByID() {
        int id = 1;
        Vehicle obj = byId.get(id);
        if (!byId.containsKey(id)){
            System.out.println("Key not found");
        }
    }

    public void testUpdate() throws Exception {
        String updateBy = "Model";
        String newVal = "newVal";
        for(Integer id : byId.keySet()) {
            Vehicle obj = byId.get(id);
            if (updateBy == "Model"){
                obj.setModel(newVal);
            }
            if (updateBy == "Make"){
                obj.setMake(newVal);
            }
            if (updateBy == "Year") {
                obj.setYear(Integer.parseInt(newVal));
            }
        }
    }

    public void testUpdateByID() throws Exception {
        int id = 1;
        String updateBy = "Model";
        String newVal = "newVal";

        Vehicle obj = byId.get(id);
        if (!byId.containsKey(id)){
            System.out.println("Key not found");
        }
        if (updateBy == "Model"){
            obj.setModel(newVal);
        }
        if (updateBy == "Make"){
            obj.setMake(newVal);
        }
        if (updateBy == "Year") {
            obj.setYear(Integer.parseInt(newVal));
        }
    }

    public void testDeleteByID() {
        int id = 1;
        byId.remove(id);
    }
}