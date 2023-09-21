package be.pxl.huizenjacht;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/houses")
public class HouseController {
    //private static final Logger LOGGER = LoggerFactory.getLogger(HouseController.class);
    private final HouseService houseService;


    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @PostMapping()
    public void addHouse(@RequestBody House house){
     //   if (LOGGER.isInfoEnabled()){
      //      LOGGER.info("Adding House [" + house.getName());
      //  }
        houseService.addHouse(house);
    }

    @GetMapping()
    public List<House> getHouse(){
        return houseService.getHouses();
    }

    @PutMapping("/{code}")
    public void putHouse(@PathVariable String code, @RequestBody House house){
        houseService.putHouse(code, house);
    }
    @DeleteMapping("/{code}")
    public void deleteHouse(@PathVariable String code){
        houseService.deleteHouse(code);
    }
}
