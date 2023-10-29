public class LiteratureCourseFactory implements CourseFactory{
    @Override
    public Course createCourse() {
        return new ScienceCourse();
    }
}
