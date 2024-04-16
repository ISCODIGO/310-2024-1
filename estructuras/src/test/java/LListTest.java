import lista.LList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LListTest {
    LList<Integer> lista;

    @Before
    public void configurar() {
        lista = new LList<>();
    }

    @Test
    public void testFirstNode() {
        lista.append(10);

        assertEquals(1, lista.length());
        assertEquals(10, (int)lista.getHeadData());
        assertEquals(10, (int)lista.getTailData());
    }

    @Test
    public void testAppend() {
        lista.append(10);
        lista.append(20);

        assertEquals(2, lista.length());
        assertEquals(10, (int)lista.getHeadData());
        assertEquals(20, (int)lista.getTailData());
    }

    @Test
    public void testRemove() {
        lista.append(10);
        lista.append(20);
        lista.append(30);
        lista.moveToEnd();

        assertEquals(30, (int)lista.remove());

        assertEquals(2, lista.length());
        assertEquals(10, (int) lista.getHeadData());
        assertEquals(20, (int) lista.getTailData());
    }

    @Test
    public void testInsert() {
        lista.append(10);
        lista.moveToStart();
        lista.insert(20);

        assertEquals(2, lista.length());
        assertEquals(20, (int)lista.getHeadData());
        assertEquals(10, (int)lista.getTailData());

        lista.append(30);  // [20]->[10]->[30]->
        lista.moveToStart();
        lista.next();
        lista.insert(40);  // [20]->[40]->[10]->[30]->

        assertEquals(40, (int)lista.getValue());
        assertEquals(4, lista.length());

        lista.prev();
        assertEquals(20, (int)lista.getValue());
        lista.next();
        lista.next();
        assertEquals(10, (int)lista.getValue());
    }
}