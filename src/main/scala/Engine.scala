package org.template.regression

import org.apache.predictionio.controller.IEngineFactory
import org.apache.predictionio.controller.Engine

class Query(
  val features: Array[Double]
) extends Serializable

class PredictedResult(
  val value: Double
) extends Serializable

class ActualResult(
  val value: Double
) extends Serializable

object RegressionTreeEngine extends IEngineFactory {
  def apply() = {
    new Engine(
      classOf[DataSource],
      classOf[Preparator],
      Map("regressiontree" -> classOf[DecisionTreeAlgorithm]),
      classOf[Serving])
  }
}
