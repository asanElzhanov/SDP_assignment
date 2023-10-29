public class ScienceCourse extends Course{
    @Override
    public void enroll() {
        System.out.println("Enrolling in Science course");
    }

    @Override
    public void study() {
        System.out.println("Studying Science");
    }

    @Override
    public void complete() {
        System.out.println("Science course completed");
    }
}
