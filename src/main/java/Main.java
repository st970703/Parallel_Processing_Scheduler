import implementations.ConversionImp;
import implementations.algorithm.AlgorithmImp;
import implementations.io.InputImp;
import interfaces.Conversion;
import interfaces.algorithm.Algorithm;
import interfaces.io.Input;
import interfaces.structures.DAG;

public class Main {
	public static void Main(String args[]) {
		//java jar scheduler.jar INPUT.dot P [OPTION]
		//Optional :
		//-p N
		//-V
		//-o OUTPUT

		// check filepath of .dot file
		final String filePath = args[0];
		if (!filePath.contains(".dot")) {
			throw new IllegalArgumentException("filePath doesn't contain .dot file.");
		}

		//check no. Of Processors is a valid integer
		final String noOfProcessors = args[1];
		try {
			//test if it is an int
			Integer.parseInt(noOfProcessors);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("no Of Processors not a valid integer");
		}

		//optional options
		if (args.length > 2) {
			// check the third option
			final String optionalOption = args[2];
			boolean contains_v = optionalOption.contains("-v");
			boolean contains_p = optionalOption.contains("-p");
			boolean contains_o = optionalOption.contains("-o");

			if (contains_v) {
				if (args.length > 3) {
					throw new IllegalArgumentException("too many arguments for visualisation option");
				}
			} else if (contains_p) {
				final String noOfParallerCores = args[3];
				try {
					// test if it is an int
					Integer.parseInt( noOfParallerCores );
				} catch (NumberFormatException e) {
					throw new IllegalArgumentException("no Of parallel cores not a valid integer");
				}
			} else if (contains_o) {
				if (args.length == 3) {
					//d e f a u l t i s INPUT−output . dot
				} else if (args.length == 4) {
					if (args.length == 4) {
						String outputFile = args[3];
					}
				} else if (args.length > 4) {
					throw new IllegalArgumentException("too many arguments for file output option");
				}
			}
		}

		Input input = new InputImp(filePath, noOfProcessors);

		Conversion conversion = new ConversionImp(input);

		DAG dag = conversion.getDAG();

		Algorithm alg = new AlgorithmImp(dag, input.getProcessorCount());
	}
}
