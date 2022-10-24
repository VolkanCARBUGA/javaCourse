package Logger;

import Entities.Lesson;

public class Filelogger implements ILogger{
    @Override
    public void log(Lesson lesson) {
        System.out.println("Logged To File : "+lesson.getLessonName()+" "+lesson.getCategory()+" "+lesson.getTeacher());
    }
}
