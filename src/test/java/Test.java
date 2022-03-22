import curs9.JavaTeacher;
import curs9.WisdomWordsService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaTeacher.class);
        WisdomWordsService wisdomWordsService = new WisdomWordsService();
        JavaTeacher javaTeacher = context.getBean("JavaTeacher" ,JavaTeacher.class);
        System.out.println(javaTeacher.getWisdom()) ;
    }

}
