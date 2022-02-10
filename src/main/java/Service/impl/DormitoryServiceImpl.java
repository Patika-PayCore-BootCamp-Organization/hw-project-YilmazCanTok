package Service.impl;
import Service.DormitoryService;
import model.Dormitory;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class DormitoryServiceImpl implements DormitoryService {

    private List<Dormitory> dormitories = new ArrayList<>();
    {
        dormitories.add(new Dormitory("Alaaddin Yurdu"));
        dormitories.add(new Dormitory("Ali Ulvi Yurdu"));
    }

    @Override
    public List<Dormitory> getAllDormitories() {
        return dormitories;
    }

    @Override
    public Dormitory getDormitory(String name) {
        return null;
    }

    @Override
    public boolean addDormitory(Dormitory dormitory) {
    return dormitories.add(dormitory);
    }

    @Override
    public Dormitory updateDormitory(String name, Dormitory dormitory) {
        Dormitory updatedD = new Dormitory();
        AtomicBoolean status = new AtomicBoolean(false);
        dormitories.forEach(dormitoryItem -> {
            if(dormitoryItem.getName().equals(name)){
                status.set(true);
                dormitoryItem.setName(dormitory.getName());
            }
        });
        if (status.get())
            return dormitory;
        return null;
    }

    @Override
    public boolean deleteDormitory(String name) {
        return false;
    }
}
