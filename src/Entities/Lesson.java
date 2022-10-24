package Entities;

import Entities.Category;

public class Lesson {
    private  int lessonId;
private  String lessonName;
private double unitPrice;
private Category category;
private Teacher teacher;

    public Lesson() {

    }

    public Lesson(int lessonId, String lessonName, double unitPrice, Category category, Teacher teacher) {
        this.lessonId = lessonId;
        this.lessonName = lessonName;
        this.unitPrice = unitPrice;
        this.category = category;
        this.teacher = teacher;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
