package org.fastcampus.student_management.domain;

import java.util.List;

public class CourseList {

    private final List<Course> course;

    public CourseList(List<Course> course) {
        this.course = course;
    }

    public void changeAllCoursesFee(int fee){
        for(Course course : course){
            if(course.isSameDay(DayOfWeek.SATURDAY) || course.isSameDay(DayOfWeek.SUNDAY)){
                course.changeFee((int) (fee * 1.5));
            }
            course.changeFee(fee);
        }
    }

}
