import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;

import java.util.Arrays;


public class FilterMovies {

    public static void main(String[] args) throws Exception {
        // Create Flink execution environment
        final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        // TODO We will write our code here


        // Create from a list
        DataSet<String> letters = env.fromCollection(Arrays.asList("a", "b", "c"));
        // Create from an array
        DataSet<Integer> numbers = env.fromElements(1, 2, 3, 4, 5);


        // Start Flink application
        env.execute();
    }
}
