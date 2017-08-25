package dummyClasses;

import interfaces.structures.Arc;
import interfaces.structures.Node;

import java.util.List;

public class DummyNode implements Node{

    private String _name;

    public DummyNode(String name) {
        _name = name;
    }

    @Override
    public String getName() {
        return _name;
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

    @Override
    public Arc getInArc(Node node) {
        return null;
    }

    @Override
    public Arc getOutArc(Node node) {
        return null;
    }
}
