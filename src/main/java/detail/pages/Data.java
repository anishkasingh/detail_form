package detail.pages;

import java.util.*;

public class Data {
    public ArrayList<edit> list_data = null;

    Data() {
        this.list_data = new ArrayList<edit>();

        edit employee1 = new edit();
        employee1.name = "Anishka";
        employee1.email = "anishka@gmail.com";
        employee1.password = "anishka@123";
        list_data.add(employee1);

        edit employee2 = new edit();
        employee1.name = "Bhuvan";
        employee1.email = "bhuvan@gmail.com";
        employee1.password = "bhuvan@123";
        list_data.add(employee2);

        edit employee3 = new edit();
        employee1.name = "Prabhjot";
        employee1.email = "prabhjot@gmail.com";
        employee1.password = "prabhjot@123";
        list_data.add(employee3);
    }
         public List<edit> getItems(){
        return this.list_data;
}
    }
