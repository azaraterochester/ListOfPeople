
import java.time.LocalDate;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro
 */
public class Student {
    
    public String firstName;
    public String lastName;
    public LocalDate birthDate;
    public int dayOfBirth;
    public int monthOfBirth;
    public int yearOfBirth;
    public int age;
    
    public Student(String theFirstName, String theLastName){
        this.firstName = theFirstName;
        this.lastName = theLastName;
    }
    
    @Override
    public String toString(){
        return(this.firstName+" "+this.lastName);
    }
    
}
