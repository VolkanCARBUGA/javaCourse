package Logger;

import Entities.Lesson;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(Lesson lesson) {
        System.out.println("Logged To database : "+lesson.getLessonName()+" "+lesson.getCategory()+" "+lesson.getTeacher());
    }
}
