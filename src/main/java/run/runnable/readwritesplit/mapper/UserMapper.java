package run.runnable.readwritesplit.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import run.runnable.readwritesplit.entity.User;

import java.util.List;

@Component
@Mapper
public interface UserMapper {
    @Insert("INSERT INTO User(`name`, `age`, `sex`) VALUES (#{name},#{age},#{sex})")
    Long addUser(User user);

    @Select("SELECT * FROM User")
    List<User> list();
}
