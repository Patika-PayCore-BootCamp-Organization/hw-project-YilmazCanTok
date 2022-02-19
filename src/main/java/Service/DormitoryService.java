package Service;
import model.Dormitory;
import java.util.List;

public interface DormitoryService {

    List<Dormitory> getAllDormitories();

    Dormitory getDormitory(Integer id);

    boolean addDormitory(Dormitory dormitory);

    Dormitory updateDormitory(Dormitory dormitory);

    boolean deleteDormitory(Integer id);

}
