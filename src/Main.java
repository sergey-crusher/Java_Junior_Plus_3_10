public class Main {
    public static void main(String[] args) {
        String s = "This is John. He is 27 years old.";
        Person person = new Person(
                s.substring(8,12),
                Integer.parseInt(s.substring(20,22))
        );
        System.out.println("Name: "+person.getName()+ " Age: "+person.getAge());
    }
}