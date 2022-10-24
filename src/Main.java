import Businnes.Manager;
import DatabaseAccess.HibernateDao;
import Entities.Category;
import Entities.Lesson;
import Entities.Teacher;
import Logger.DatabaseLogger;
import Logger.EmailLogger;
import Logger.ILogger;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Category category=new Category(1,"BackEnd");
        Teacher teacher=new Teacher(1,"Engin Demiroğ");
        Lesson lesson=new Lesson(1,"Java",29.99,category,teacher);
        ArrayList<ILogger> iLoggers=new ArrayList<>();
        iLoggers.add(new DatabaseLogger());
        iLoggers.add(new EmailLogger());
        Manager manager=new Manager(new HibernateDao(),iLoggers);
        manager.addCategory(category);
        manager.addLesson(lesson);
    }
}