public class ScienceCourseFactory implements CourseFactory{
    @Override
    public Course createCourse() {
        return new ScienceCourse();
    }
}
