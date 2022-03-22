package curs9;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("curs9")
@Data
@Component("JavaTeacher")
public class JavaTeacher implements ITeacher{
    WisdomWordsService wisdomService;

    // constructor unic care primeste ca parametru un obiect de tipul curs9.WisdomWordsService
    @Autowired
    public JavaTeacher(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
        }

    @Override
    public String getHomeWork() {
        return "Create 100 classes";
    }

    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }
}
