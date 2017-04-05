/**
* Metric Definition Dimension ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.jO.e.p0CU.vE.eO.tV.b.kUFYE.u.d.g-content.html">Metric Definition Dimension ABE</a> 
* The Metric Definition Dimension ABE contains all entities describing t 
* he Dimension in a Metric context. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_abe.metric_definition_dimension_business_entity ;

/**
* The use of a dimension by MetricDefinition 
 @since SID_R16.5
*/ 

public  class MetricDefinitionDimensionUse  {



/**  
* Field mandatory
* Indicates whether this dimension is mandatory for this use. 

*/
protected Boolean mandatory ;




/**  
* Field metricDefinition
*/
protected MetricDefinition metricDefinition ;




/**  
* Field metricDimension
*/
protected List<MetricDimension> metricDimension ;




/**  
* Field validFor
* The period for which the MetricDefinitionDimensionUse is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field metricDefDimValueUse
*/
protected List<MetricDefDimValueUse> metricDefDimValueUse ;


}