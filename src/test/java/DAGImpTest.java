import dummyClasses.DummyNode;
import implementations.structures.DAGImp;
import interfaces.structures.DAG;
import interfaces.structures.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * This is a test suite for the DAGImp class.
 */
public class DAGImpTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void addNodesTest() {
        DAG dag = DAGImp.getNewInstance();
        DummyNode n1 = new DummyNode("node");

        dag.add(n1);

        List<Node> nodes = dag.getAllNodes();

        assertEquals(nodes.get(0).getName(), "node");
    }

}