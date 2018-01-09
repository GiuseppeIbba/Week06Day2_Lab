import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest{

    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop();
        person = new Person();
    }

    @Test
    public void hasEmptyQueue(){
        assertEquals(0, busStop.getQueueCount());
    }

    @Test
    public void hasPersonOnQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.getQueueCount());

    }

    @Test
    public void canRemovePerson(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(1, busStop.getQueueCount());

    }

}
