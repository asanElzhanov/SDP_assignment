public class MathCourse extends Course{
    @Override
    public void enroll() {
        System.out.println("Enrolling in Math course");
    }

    @Override
    public void study() {
        System.out.println("Studying Math");
    }

    @Override
    public void complete() {
        System.out.println("Math course completed");
    }
}
