import java.util.ArrayList;

public class Bus {

    String destination;
    int capacity = 2;
    ArrayList<Person> persons;
//    BusStop busStop;

    public Bus(){
        this.persons = new ArrayList<>();
    }

    public int getPersonCount() {
        return this.persons.size();
    }

    public void addPerson(Person person) {
        if (this.capacity > getPersonCount()){
            this.persons.add(person);
        }
    }


    public void removePerson() {
        this.persons.remove(0);
    }

    public void pickupPerson(BusStop busStop) {
        Person person = busStop.removePerson();
        addPerson(person);

    }
}
