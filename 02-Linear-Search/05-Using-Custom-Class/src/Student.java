public class Student {
    private String name;
    
    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object student) {
        if (this == student) {
            return true;
        }
        if (this == null) {
            return false;
        }
        Student another = (Student)student;
        
        return this.name.equals(another.name);
    }
}
