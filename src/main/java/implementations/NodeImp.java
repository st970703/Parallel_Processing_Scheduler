package implementations;

import java.util.ArrayList;
import java.util.List;

import interfaces.Arc;
import interfaces.Node;

/**
 * This class is responsible for representing a node in a DAG.
 * It stores the node's name, weight, ingoing and outgoing arcs to other nodes.
 * 
 * This class implements the Node interface.
 * @author Darius
 *
 */
public class NodeImp implements Node {

	//Node attributes
	private String _name;
	private int _weight;
	private List<Arc> _outgoing;
	private List<Arc> _ingoing;
	
	private int _bestStartTime;
	private int _bestProcessor;
	private int _currentStartTime;
	private int _currentProcessor;
	
	/**
	 * Constructor for the NodeImp to make a NodeImp object given a name and a weight
	 * @param name - Letter representing the node
	 * @param weight - Cost to execute the task in arbitrary units
	 */
	public NodeImp(String name, int weight){
		_name = name;
		_weight = weight;

		_outgoing = new ArrayList<Arc>();
		_ingoing = new ArrayList<Arc>();
	}
	
	@Override
	public String getName() {
		return _name;
	}

	@Override
	public int getWeight() {
		return _weight;
	}

	@Override
	public void addOutArc(Arc arc) {
		_outgoing.add(arc);
	}

	@Override
	public void addInArc(Arc arc) {
		_ingoing.add(arc);
	}

	@Override
	public List<Node> getPredecessors() {
		List<Node> predecessors = new ArrayList<Node>();
		for (Arc arc : _ingoing){
			predecessors.add(arc.getSource());
		}
		return predecessors;
	}

	@Override
	public List<Node> getSuccessors() {
		List<Node> successors = new ArrayList<Node>();
		for (Arc arc : _outgoing){
			successors.add(arc.getDestination());
		}
		return successors;
	}

	//todo implement getter and setter methods
    @Override
    public int getBestStartTime() {
        return 0;
    }

    @Override
    public String getBestProcessor() {
        return null;
    }

    @Override
    public int getCurrentStartTime() {
        return 0;
    }

    @Override
    public String getCurrentProcessor() {
        return null;
    }

    @Override
    public int setBestStartTime() {
        return 0;
    }

    @Override
    public String setBestProcessor() {
        return null;
    }

    @Override
    public int setCurrentStartTime() {
        return 0;
    }

    @Override
    public String setCurrentProcessor() {
        return null;
    }

}
