package main.java.com.gosvea.iccpra.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import main.java.com.gosvea.iccpra.pojo.Icpie; 

@Mapper
public interface IcpieMapper {

    @Select("SELECT * FROM Icpie WHERE icpiename=#{icpiename}")
    public Icpie findByIcpieName(String username);
    @Insert("INSERT INTO Icpie(icpiename,password)")
    public void register(String icpiename, String password);
}
