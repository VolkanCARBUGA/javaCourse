package DatabaseAccess;

import Entities.Lesson;

public class HibernateDao implements IDao{
    @Override
    public void add(Lesson lesson) {
        System.out.println("Hibernate ile Eklendi : "+lesson.getLessonName());
    }
}
