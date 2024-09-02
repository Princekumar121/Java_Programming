public class Student1 {
    int id;
    String name, branch, city, university;

    Student1(int id) {
        this.id = id;
    }

    Student1(int id, String name) {
        this(id);
        this.name = name;
    }

    Student1(int id, String name, String branch) {
        this(id, name);
        this.branch = branch;
    }

    Student1(int id, String name, String branch, String city) {
        this(id, name, branch);
        this.city = city;
    }

    Student1(int id, String name, String branch, String city, String university) {
        this(id, name, branch, city);
        this.university = university;
    }

    void display() {
        System.out.println(id + " " + name + " " + branch + " " + city + " " + university);
    }

    public static void main(String args[]) {
   
        Student1 s1 = new Student1(3, "Mike", "Electrical", "New York","XYZ University");
        Student1 s2 = new Student1(4, "Sarah", "Mechanical", "London", "ABC University");

        s1.display();
        s2.display();
     
    }
}

