import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void printObject(Vehicle obj){
        System.out.println("ID: "+obj.getId());
        System.out.println("Model: "+obj.getModel());
        System.out.println("Make: "+obj.getMake());
        System.out.println("Year: : "+obj.getYear());
        System.out.println("________________________________");
    }

    public static void main(String args[]) throws Exception {
        Crud obj = new Crud();
        //Client
        Scanner sc= new Scanner(System.in);
        int id = 0;
        while (true){
            System.out.println("Please select the option number:\n1.Create a entry\n2.Get a entry\n3.Update a entry\n4.Delete a entry\n5.Exit");
            int input = sc.nextInt();
            if(input == 1){
                System.out.println("Please enter the model name");
                String model = sc.next();
                System.out.println("Please enter the make name");
                String make = sc.next();
                System.out.println("Please enter the year of the vehicle");
                int year = sc.nextInt();
                obj.create(model,id = id+1, year,make);
            }
            if(input == 2){
                System.out.println("Please select one of the following.\n1.Get all the entry\n2.Get entry by ID\n3.Get entry by Make\n4.Get entry by Model\n5.Get entry by year");
                int choice = sc.nextInt();
                if (choice == 1){
                    ArrayList<Vehicle> list = obj.get();
                    for (Vehicle temp:
                            list) {
                        printObject(temp);
                    }
                }
                if (choice == 2){
                    System.out.println("Please enter the ID");
                    int inp_id = sc.nextInt();
                    Vehicle res = obj.getByID(inp_id);
                    printObject(res);
                }
                if (choice == 3){
                    System.out.println("Please enter the Make");
                    String inp_make = sc.next();
                    ArrayList<Vehicle> list = obj.getByMake(inp_make);
                    for (Vehicle temp:
                            list) {
                        printObject(temp);
                    }
                }
                if (choice == 4){
                    System.out.println("Please enter the Model");
                    String inp_model = sc.next();
                    ArrayList<Vehicle> list = obj.getByModel(inp_model);
                    for (Vehicle temp:
                            list) {
                        printObject(temp);
                    }
                }
                if (choice == 5){
                    System.out.println("Please enter the year");
                    int inp_year = sc.nextInt();
                    ArrayList<Vehicle> list = obj.getByYear(inp_year);
                    for (Vehicle temp:
                            list) {
                        printObject(temp);
                    }
                }
            }
            if (input == 3){
                System.out.println("Please select 1 if you want to update all the entries else 2");
                int choice = sc.nextInt();
                if(choice == 1){
                    System.out.println("Which entry you want to update for all. Say Make,Model,Year");
                    String inp = sc.next();
                    System.out.println("What is the new value you want to update into");
                    String newVal = sc.next();
                    if (inp.toLowerCase().equals("make")){
                        obj.update("Make",newVal);
                    }
                    if (inp.toLowerCase().equals("year")){
                        obj.update("Year",newVal);
                    }
                    if (inp.toLowerCase().equals("model")){
                        obj.update("Model",newVal);
                    }
                }
                else{
                    System.out.println("Please enter the ID you want to make changes");
                    int inp_id = sc.nextInt();
                    System.out.println("Which entry you want to update for all. Say Make,Model,Year");
                    String inp = sc.next();
                    System.out.println("What is the new value you want to update into");
                    String newVal = sc.next();
                    if (inp.toLowerCase().equals("make")){
                        obj.updateByID(inp_id,"Make",newVal);
                    }
                    if (inp.toLowerCase().equals("year")){
                        obj.updateByID(inp_id,"Year",newVal);
                    }
                    if (inp.toLowerCase().equals("model")){
                        obj.updateByID(inp_id,"Model",newVal);
                    }
                }
            }
            if(input == 4){
                System.out.println("Please enter the ID you want to delete");
                int inp_id = sc.nextInt();
                obj.deleteByID(inp_id);
            }
            if(input == 5){
                break;
            }
        }
    }

}
