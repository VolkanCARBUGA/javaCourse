package Businnes;

import DatabaseAccess.IDao;
import Entities.Category;
import Entities.Lesson;
import Entities.Teacher;
import Logger.ILogger;

import java.util.ArrayList;

public class Manager {
    private IDao iDao;
    private ArrayList<ILogger> iLogger;
    ArrayList<Lesson> lessonArrayList = new ArrayList<>();
    ArrayList<Category> categoryArrayList = new ArrayList<>();
    Category category = new Category(1, "BackEnd");
    Category category1 = new Category(2, "Mobile");
    Category category2 = new Category(3, "Cyber security");
    Teacher teacher = new Teacher(1, "Engin Demiroğ");
    Teacher teacher1 = new Teacher(2, "Murat Kurtboğan");
    Teacher teacher2 = new Teacher(3, "Kerem Varış");
    Lesson lesson1 = new Lesson(1, "Java", 30.99, category, teacher);
    Lesson lesson2 = new Lesson(2, "Android", 30.99, category1, teacher2);
    Lesson lesson3 = new Lesson(3, "Flutter", 30.99, category1, teacher2);


    public Manager(IDao iDao, ArrayList<ILogger> iLogger) {
        this.iDao = iDao;
        this.iLogger = iLogger;
    }

    public void addCategory(Category category) {
        categoryArrayList.add(category);
        categoryArrayList.add(category1);
        categoryArrayList.add(category2);
        for (Category data : categoryArrayList) {
            if (category.getCategoryName().toLowerCase().equals(data)) {
                System.out.println("Kategori ismi Aynı olamaz");
            }
        }
        iDao.addCategory(category);
    }

    public void addLesson(Lesson lesson) {
        lessonArrayList.add(lesson1);
        lessonArrayList.add(lesson2);
        lessonArrayList.add(lesson3);
        if (lesson.getUnitPrice() < 0) {
            System.out.println("kur fiyatı Sıfırdan küçük Olamaz");
        }
        for (Lesson data : lessonArrayList) {
            if (lesson.getLessonName().toLowerCase().equals(data)) {
                System.out.println("Ders ismi Aynı olamaz");
            }
        }
        iDao.addLesson(lesson);
        for (ILogger logger : iLogger) {
            logger.log(lesson);
        }

    }


}
