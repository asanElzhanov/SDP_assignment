public class LiteratureCourse extends Course{
    @Override
    public void enroll() {
        System.out.println("Enrolling in Literature course");
    }

    @Override
    public void study() {
        System.out.println("Studying Literature");
    }

    @Override
    public void complete() {
        System.out.println("Literature course completed");
    }
}
