package UseOfLambda;

public class Execute {
    public static void main(String[] args) {
        Employee a = ()->"iam a QA Engineer";
        Employee developer =()->"iam a developer";


        System.out.println(a.getName());
        System.out.println(developer.getName());
    }
}
