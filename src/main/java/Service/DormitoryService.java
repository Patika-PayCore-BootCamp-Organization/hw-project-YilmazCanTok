package Service;
import model.Dormitory;

import java.util.List;

public interface DormitoryService {

    List<Dormitory> getAllDormitories();

    Dormitory getDormitory(String name);

    boolean addDormitory(Dormitory dormitory);

    Dormitory updateDormitory(String name, Dormitory dormitory);

    boolean deleteDormitory(String name);

}
