interface LearningPerson {
    void studyAtHome();
}

interface TeachingPerson {
    void teachToOtherPeople();
}

class CollegePerson {
    String name;
    String surname;
    int collegeId;

    CollegePerson(String name, String surname, int collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    void goToCollege() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("College ID: " + collegeId);
    }
}

class Student extends CollegePerson implements LearningPerson {
    int academicYear;

    Student(String name, String surname, int collegeId, int academicYear) {
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Student " + name + " is studying at home.");
    }
}

class Professor extends CollegePerson implements TeachingPerson {
    String teachingSubject;

    Professor(String name, String surname, int collegeId, String teachingSubject) {
        super(name, surname, collegeId);
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Professor " + name + " is teaching " + teachingSubject);
    }
}

class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
    boolean isGoingToBeAPhD;

    Assistant(String name, String surname, int collegeId, boolean willBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Assistant " + name + " is studying at home.");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Assistant " + name + " is teaching.");
    }
}

public class CollegeTest {
    public static void main(String[] args) {
        Student student = new Student("Alice", "Smith", 12345, 3);
        Professor professor = new Professor("John", "Doe", 67890, "Computer Science");
        Assistant assistant = new Assistant("Emily", "Brown", 54321, true);

        student.goToCollege();
        student.studyAtHome();

        professor.goToCollege();
        professor.teachToOtherPeople();

        assistant.goToCollege();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}