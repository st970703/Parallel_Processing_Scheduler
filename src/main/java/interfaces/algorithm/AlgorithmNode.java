package interfaces.algorithm;

import implementations.algorithm.AlgorithmNodeImp;
import interfaces.structures.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * See the implementation class for more details.
 * @see implementations.algorithm.AlgorithmNodeImp
 * 
 * @author Daniel
 *
 */
public interface AlgorithmNode {
    /**
     * This static method converts a list of nodes to a list of algorithmNode objects
     *
     * @param nodes
     * @return a list of algorithmNode objects.
     */
    static List<AlgorithmNode> convertNodetoAlgorithmNode(List<Node> nodes) {
        List<AlgorithmNode> algorithmNodeList = new ArrayList<>();

        for (Node node : nodes) {
            algorithmNodeList.add(new AlgorithmNodeImp(node.getName()));
        }

        return algorithmNodeList;
    }

    AlgorithmNode createClone();

    String getNodeName();

    int getCore();

    void setCore(int core);
}
