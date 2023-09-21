package be.pxl.huizenjacht;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseService {
    private final List<House> houses = new ArrayList<>();

    public void addHouse(House house){
        houses.add(house);
    }

    public List<House> getHouses(){
        return houses;
    }


    public void putHouse(String code, House house) {
        int index = -1;
        for (House targetHouse :
                houses) {
            if (targetHouse.getCode().equals(code)) {
                index = houses.indexOf(targetHouse);
            }
            }
        houses.set(index, house);
    }

    public void deleteHouse(String code) {
        int index = -1;
        for (House targetHouse :
                houses) {
            if (targetHouse.getCode().equals(code)) {
                index = houses.indexOf(targetHouse);
            }
        }
        houses.remove(index);
    }
}
