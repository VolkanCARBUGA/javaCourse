package DatabaseAccess;

import Entities.Category;
import Entities.Lesson;

public interface IDao {
    public  void addCategory(Category category);
    public  void addLesson(Lesson lesson) ;


}
