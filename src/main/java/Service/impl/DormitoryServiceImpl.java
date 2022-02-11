package Service.impl;
import Service.DormitoryService;
import model.Dormitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DormitoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class DormitoryServiceImpl implements DormitoryService {

    @Autowired
    private DormitoryRepository dormitoryRepository;

    @Override
    public List<Dormitory> getAllDormitories() {
        List<Dormitory> all = dormitoryRepository.findAll(); //We got our dormitories in our repository. And they are in our list.
        return all;                                          //We got our full repository. And they will be in controller.
    }

    @Override
    public Dormitory getDormitory(Integer id) {             //Here we are checking if there is a domitory by that integer or not. If we have that dormitory
        Optional<Dormitory> byId = dormitoryRepository.findById(id);    //We will get it but if we don't have it, we will get nothing.
        if (byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    @Override
    public boolean addDormitory(Dormitory dormitory) {      //Here we have adding dormitory function. With using this if we have dormitory object, than
        Dormitory save = dormitoryRepository.save(dormitory);   //we can add our dormitory and it will give us a true value. But if we don't have dormitory
        if(save == null){                                       //object to save, we will get false value.
            return false;
        }
        return true;
    }

    @Override
    public Dormitory updateDormitory(Dormitory dormitory) {
        return dormitoryRepository.save(dormitory);     //Here if we have dormitory, we will update it with save method.

    }

    @Override
    public boolean deleteDormitory(Integer id) {     //Here we have the delete operation. We are checking if we have dormitory or not. If we have
        Dormitory dormitory = getDormitory(id);      //dormitory, than we can delete it and return true. But if we don't have it, it will give us
        if (dormitory == null){                      //false value.
            return false;
        }
        dormitoryRepository.delete(getDormitory(id));
        return true;
    }
}
