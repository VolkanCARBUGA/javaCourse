package Logger;

import Entities.Lesson;

public class EmailLogger implements ILogger{
    @Override
    public void log(Lesson lesson) {
        System.out.println("Logged To Email : "+lesson.getLessonName()+" "+lesson.getCategory()+" "+lesson.getTeacher());
    }
}
