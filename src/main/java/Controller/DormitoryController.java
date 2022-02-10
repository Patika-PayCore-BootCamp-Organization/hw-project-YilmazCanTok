package Controller;
import Service.DormitoryService;
import Service.impl.DormitoryServiceImpl;
import model.Dormitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class DormitoryController {

    @Autowired
    private DormitoryService dormitoryService;


    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello(){return "hello, Selçuk University Students";}

    @RequestMapping(method = RequestMethod.GET, path = "/all")
    public List<Dormitory> getAllDormitories(){
        return dormitoryService.getAllDormitories();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public boolean addDormitory(@RequestBody Dormitory dormitory){
        return dormitoryService.addDormitory(dormitory);
    }
}
