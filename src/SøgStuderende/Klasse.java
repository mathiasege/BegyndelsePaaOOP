package SøgStuderende;

import java.util.ArrayList;

public class Klasse {
    private ArrayList<Studerende> studerende = new ArrayList<>();

    public void setStuderende(Studerende studerende) {
        this.studerende.add(studerende);
    }

    public Studerende getStudent(String navn){
        for(Studerende student : studerende){
            if(student.getNavn().equals(navn)){
                return student;
            }
        }

        return null;
    }

    public void redigerStuderende(Studerende old, Studerende newStudent){
        int index = studerende.indexOf(old);

        studerende.set(index, newStudent);
    }

    @Override
    public String toString(){
        String student = "";
        for(Studerende temp : studerende){
            student += temp + "\n";
        }
        return student;
    }
}
