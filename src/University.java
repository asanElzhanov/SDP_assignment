public class University {
    public static void main(String[] args) {
        CourseFactory mathFactory = new MathCourseFactory();
        Course mathCourse = mathFactory.createCourse();
        mathCourse.enroll();
        mathCourse.study();
        mathCourse.complete();

        CourseFactory scienceFactory = new ScienceCourseFactory();
        Course scienceCourse = scienceFactory.createCourse();
        scienceCourse.enroll();
        scienceCourse.study();
        scienceCourse.complete();

        CourseFactory literatureFactory = new LiteratureCourseFactory();
        Course literatureCourse = literatureFactory.createCourse();
        literatureCourse.enroll();
        literatureCourse.study();
        literatureCourse.complete();
    }
}