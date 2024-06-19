package main.java.com.gosvea.iccpra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping; // 确认导入
import org.springframework.web.bind.annotation.RestController; // 确认导入

import main.java.com.gosvea.iccpra.pojo.Icpie;
import main.java.com.gosvea.iccpra.pojo.Result;
import main.java.com.gosvea.iccpra.service.IcpieService;

@RestController
public class IcpieController {

    @Autowired
    private IcpieService icpieService;

    @PostMapping("/register")
    public Result rergister(String icpiename, String password) {

        Icpie ie = icpieService.findByIcpieName(icpiename);
        if (ie == null) {
            icpieService.registerNewIcpie(icpiename, password);
            return Result.success();
        } else {
            return Result.error("ICPIE name has been taken");
        }
    }
}
