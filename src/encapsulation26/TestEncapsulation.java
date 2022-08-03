package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setName("bhavesh");
        obj.setRollNo(19);
        obj.setAge(51);

        System.out.println("CODEBUSTER name : " + obj.getName());
        System.out.println("Codbuster rollno : "+ obj.getRollNo());
        System.out.println("Codebuster age : "+ obj.getAge());
    }
}
