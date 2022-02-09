package Controller;
import model.Dormitory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

public class DormitoryController {

    private List<Dormitory> dormitories = new ArrayList<>();
    {
        dormitories.add(new Dormitory("Alaaddin Yurdu"));
        dormitories.add(new Dormitory("Ali Ulvi Yurdu"));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello(){return "hello, Selçuk University Students";}

    @RequestMapping(method = RequestMethod.GET, path = "/all")
    public List<Dormitory> getAllDormitories(){return dormitories;}

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public boolean addDormitory(@RequestBody Dormitory dormitory){return dormitories.add(dormitory);}
}
