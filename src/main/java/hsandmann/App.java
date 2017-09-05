package hsandmann;

import org.deeplearning4j.nn.api.OptimizationAlgorithm;
import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.conf.layers.DenseLayer;
import org.deeplearning4j.nn.weights.WeightInit;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) {
    
    	
    	MultiLayerConfiguration conf = new NeuralNetConfiguration.Builder()
    	        .iterations(1)
    	        .weightInit(WeightInit.XAVIER)
    	        .activation("relu")
    	        .optimizationAlgo(OptimizationAlgorithm.STOCHASTIC_GRADIENT_DESCENT)
    	        .learningRate(0.05)
    	        // ... other hyperparameters
    	        .list()
    	        .backprop(true)
    	        .layer(0, new DenseLayer.Builder().nIn(784).nOut(250).build())
    	        .build();

    }
        
    
}
