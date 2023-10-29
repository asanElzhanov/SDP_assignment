public class MathCourseFactory implements CourseFactory{
    @Override
    public Course createCourse() {
        return new MathCourse();
    }
}
