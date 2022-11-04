import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * .
     * removeVehicle
     */
    public void removeVehicle(String registrationNumber) {
        if (vehicleList.size() > 0) {
            for (int i = 0; i < vehicleList.size(); i++) {
                if (vehicleList.get(i).registrationNumber == registrationNumber) {
                    vehicleList.remove(vehicleList.get(i));
                }
            }
        }
    }

    /**
     * .
     * getVehiclesInfo()
     */
    public String getVehiclesInfo() {
        String rs = "";
        if (vehicleList.size() <= 0) {
            rs += name + " has no vehicle!";
        } else {
            rs += name + " has:\n\n";
            // trả về danh sách phương tiện theo thứ tự
            for (int i = 0; i < vehicleList.size(); i++) {
                rs += vehicleList.get(i).getInfo();
            }
        }
        return rs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
