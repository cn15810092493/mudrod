/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you 
 * may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package esiptestbed.mudrod.driver;

import java.io.Serializable;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * ClassName: SparkDriver 
 * Function: spark driver. 
 *
 * @author Yun
 
 */
public class SparkDriver implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  // sc:spark context
public JavaSparkContext sc;

  /**
 * Creates a new instance of SparkDriver.
 *
 */
public SparkDriver() {
    SparkConf conf = new SparkConf().setAppName("Testing")
        .setMaster("local[2]");
    sc = new JavaSparkContext(conf);
  }
}
