public class Vehicle {
    private String model;
    private int id;
    private int year;
    private String make;

    public Vehicle(String model, int id, int year, String make) throws Exception {
        this.id = id;
        if(year >= 1950 && year <= 2050){
            this.year = year;
        }
        else{
            throw new Exception("Year should be between 1950 and 2050");
        }
        if(make != "" && make != null){
            this.make = make;
        }
        else{
            throw new Exception("Make cannot be Null");
        }
        if(model != "" && model != null){
            this.model = model;
        }
        else {
            throw new Exception("Model cannot be Null");
        }
    }

    public Vehicle(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public int getYear() {
        return year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setYear(int year) throws Exception {
        if(year >= 1950 && year <= 2050){
            this.year = year;
        }
        else{
            throw new Exception("Year should be between 1950 and 2050");
        }
    }
    public void setMake(String make) throws Exception {
        if(make != "" && make != null){
            this.make = make;
        }
        else{
            throw new Exception("Make cannot be Null");
        }
    }
    public void setModel(String model) throws Exception {
        if(model != "" && model != null){
            this.model = model;
        }
        else{
            throw new Exception("Model cannot be Null");
        }
    }
}
