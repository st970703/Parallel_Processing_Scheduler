package Node;

import javafx.scene.shape.Arc;

import java.util.List;

/**
 * Created by st970 on 1/08/2017.
 */
public abstract class NodeImpl implements Node{
    String name;

    int weight;

    List<Arc> out;

    List<Arc> in;

    int bestStartTime;

    String bestProcessor;

    int currentStartTime;

    String currentProcessor;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public void addOutArc(Arc arc) {

    }

    @Override
    public void addInArc(Arc arc) {

    }

    @Override
    public List<Node> getPredecessors() {
        return null;
    }

    @Override
    public List<Node> getSuccessors() {
        return null;
    }
}
