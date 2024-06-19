package main.java.com.gosvea.iccpra.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import main.java.com.gosvea.iccpra.pojo.Icpie; 

@Mapper
public interface IcpieMapper {

    @Select("Select * from Icpie where icpiename=#{icpiename}")
    public Icpie findByIcpieName(String username);
    @Insert("insert into Icpie(icpiename,password)")
    public void register(Stirng icpiename, String password);
}
