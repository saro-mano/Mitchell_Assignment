##### CLASSES
There are 3 classes in this program namely
1. Vehicle
2. Crud
3. MainClass
4. VehicleTest
5. CrudTest

##### Class Vehicle
This class is to create vehicle object. The variables are the features of the vehicle namely id, model, year and make. This class has constructors and getter and setter methods. Exceptions are handled for
1. When the year is not between 1950 and 2050
2. When the model and make are null

##### Class Crud
This class handles create, get, update and delete methods. For in-memory persistence I am using an Hashmap to store all the vehicle objects. The key will be ID and the values will be the vehicle object created using Vehicle class.
- create() method creates objects and hashes to our hashmap.
    - id is the primary key and is auto-incremented.
    - rest of the inputs(make,model,year) are collected from the user.
- get() method returns list of all the data entered so far.
- getByID() method returns the object corresponding to that ID.
- getByYear() method returns all the objects corresponding to that year.
- getByMake() method returns all the objects corresponding to that make.
- getByModel() method returns all the objects corresponding to that model.
- update() method updates all the objects with the given column and value
- updateByID() method updates the objects corresponding to that ID.
- deleteByID() method deletes the objects based on the ID.

##### Class MainClass
This class is to call the crud operations and display the values.
There are two functions in this class.
- printObject() prints all the values of the Vehicle object.
- main() works as a client displaying the list of CRUD operations.

##### Class VehicleTest
This class is to perform unit testing for class Vehicle

##### Class CrudTest
This class is to perform unit testing for class Crud

##### Time Complexities:
* create(), getByID(), updateByID() and deleteByID() takes O(1) operation cost since we are using HashMap.
* Rest of the methods take O(n) where n stands for the size of the input.


##### How to run?
1. Load the project into any IDE's (say Eclipse, IntelliJ IDEA, etc)
2. Run the MainClass.main()
3. Give the corresponding inputs in the console.
