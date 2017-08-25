package io;

import dummyClasses.DummyNode;
import implementations.structures.ArcImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestArcImpl {

    @Test
    /**
     * Simple test that uses Dummy Node to test construction of an arc.
     */
    public void testArcConstruction() {
    	DummyNode mock1 = new DummyNode("A");
    	DummyNode mock2 = new DummyNode("B");
        ArcImpl arc1 = new ArcImpl(1,mock1,mock2);

        assertEquals(arc1.getWeight(), 1);
        assertEquals(arc1.getSource(), mock1);
        assertEquals(arc1.getDestination(), mock2);
    }
}
