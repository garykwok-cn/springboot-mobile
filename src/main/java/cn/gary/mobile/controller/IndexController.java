package cn.gary.mobile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.mobile.device.Device;

@Controller
public class IndexController {
    /*
    @GetMapping("/")
    public String index(Device device){
        String deviceType = "browser";
        String platform = "browser";
        if(device.isNormal()){
            deviceType = "browser";
        }else if(device.isMobile()){
            deviceType = "mobile";
        }else if(device.isTablet()){
            deviceType = "tablet";
        }
        platform = device.getDevicePlatform().name();

        if(platform.equalsIgnoreCase("UNKNOWN")){
            platform = "browser";
        }
        return "index";
    }
    */

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
