import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Crud {
    private static HashMap<Integer, Vehicle> byId = new HashMap<>();

    public static void create(String model, int id, int year, String make)throws Exception{
        Vehicle obj = new Vehicle(model,id,year,make);
        //By ID {Assuming ID's are always unique}
        byId.put(id,obj);
    }

    //Function to get All Objects
    public static ArrayList<Vehicle> get(){
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Integer id : byId.keySet()){
            Vehicle obj = byId.get(id);
            result.add(obj);
//            printObject(obj);
        }
        if (result.size() == 0){
            System.out.println("No item to get");
        }
        return result;
    }

    public static ArrayList<Vehicle> getByYear(int year){
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
        return result;
    }

    public static ArrayList<Vehicle> getByModel(String model){
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Integer id : byId.keySet()){
            Vehicle obj = byId.get(id);
            if (obj.getModel().equals(model)){
                result.add(obj);
            }
        }
        if (result.size() == 0){
            System.out.println("No item to get");
        }
        return result;
    }

    public static ArrayList<Vehicle> getByMake(String make){
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Integer id : byId.keySet()){
            Vehicle obj = byId.get(id);
            if (obj.getMake().equals(make)){
                result.add(obj);
            }
        }
        if (result.size() == 0){
            System.out.println("No item to get");
        }
        return result;
    }

    public static Vehicle getByID(int id){
        Vehicle obj = byId.get(id);
        if (!byId.containsKey(id)){
            System.out.println("Key not found");
        }
        return obj;
    }

    public static void update(String updateBy, String newVal) throws Exception {
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

    public static void updateByID(int id,String updateBy, String newVal) throws Exception {
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

    public static void deleteByID(int id) {
        if (!byId.containsKey(id)){
            System.out.println("Key not found");
        }
        byId.remove(id);
    }
}
