import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus();
        person = new Person();
        busStop = new BusStop();
        busStop.addPerson(person);
    }

    @Test
    public void canCountPersons(){
        assertEquals(0, bus.getPersonCount());
    }

    @Test
    public void canAddPerson(){
        bus.addPerson(person);
        assertEquals(1, bus.getPersonCount());
    }

    @Test
    public void canAddPersonOverCapacity(){
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        assertEquals(2, bus.getPersonCount());
    }

    @Test
    public void canRemovePerson(){
        bus.addPerson(person);
        bus.addPerson(person);
        bus.removePerson();
        assertEquals(1, bus.getPersonCount());
    }

    @Test
    public void canPickupPerson(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        bus.pickupPerson(busStop);
        assertEquals(1, bus.getPersonCount());
    }
}
