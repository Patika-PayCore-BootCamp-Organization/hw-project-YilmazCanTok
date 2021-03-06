package Controller;
import Service.DormitoryService;
import model.Dormitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/Dormitory")
public class DormitoryController {

    @Autowired
    private DormitoryService dormitoryService;


    @GetMapping(value = "/hello")
    public String hello(){return "hello, Selçuk University Students";}

    @GetMapping(value = "/all")
    public List<Dormitory> getAllDormitories(){  //Here we saw all dormitories we have.
        return dormitoryService.getAllDormitories();
    }

    @GetMapping(value = "/add")
    public Dormitory getDormitory(@RequestBody @Min(1) Integer id){    //Here we get our dormitory from it's id. It must be bigger than 0.
        return dormitoryService.getDormitory(id);
    }

    @PostMapping(value = "/add")
    public boolean addDormitory(@RequestBody Dormitory dormitory){  //Here we saw the result of adding dormitory.
        return dormitoryService.addDormitory(dormitory);
    }

    @PutMapping(value = "/update")
    public Dormitory updateDormitory(@Valid @RequestBody Dormitory dormitory){  //Here we update the existing dormitory we have.
        return dormitoryService.updateDormitory(dormitory);
    }

    @DeleteMapping(value = "/delete")
    public boolean deleteDormitory(@RequestParam @Min(1) Integer id){     //Here we delete our existing dormitory from our system.r
        return dormitoryService.deleteDormitory(id);
    }
}
