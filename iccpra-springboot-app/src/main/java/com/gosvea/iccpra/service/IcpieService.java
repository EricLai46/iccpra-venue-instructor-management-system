package main.java.com.gosvea.iccpra.service;

import main.java.com.gosvea.iccpra.pojo.Icpie;

public interface IcpieService {
    Icpie findByIcpieName(String username);

    void registerNewIcpie(String icpiename, String password);

}
