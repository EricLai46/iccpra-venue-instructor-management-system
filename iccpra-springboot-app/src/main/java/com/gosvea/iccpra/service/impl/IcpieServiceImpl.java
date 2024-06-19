package main.java.com.gosvea.iccpra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.gosvea.iccpra.mapper.IcpieMapper;
import main.java.com.gosvea.iccpra.pojo.Icpie;
import main.java.com.gosvea.iccpra.service.IcpieService;
@Service
public class IcpieServiceImpl implements IcpieService {
    @Autowired
    private IcpieMapper icpiemapper;

    @Override
    public Icpie findByIcpieName(String icpiename) {
            Icpie ie=icpiemapper.findByIcpieName(icpiename);
            return ie;
    }

    @Override
    public void registerNewIcpie(String icpiename, String password) {
            //secert password
            icpiemapper.register(icpiename,password);
    }
}
