package DatabaseAccess;

import Entities.Lesson;

public class JDBCDao implements IDao{
    @Override
    public void add(Lesson lesson) {
        System.out.println("JDBC ile Eklendi : "+lesson.getLessonName());
    }
}
