package ueb07;

import java.util.Comparator;

public class NameMatrikelComparator implements Comparator <Student> {

    @Override
    public int compare(Student s1, Student s2){
        if (s1.getName().equals(s2.getName())){
            return Integer.compare(s1.getMatrikel(), s2.getMatrikel());
            } else{
            return s1.getName().compareTo(s2.getName());
        }
    }
}
