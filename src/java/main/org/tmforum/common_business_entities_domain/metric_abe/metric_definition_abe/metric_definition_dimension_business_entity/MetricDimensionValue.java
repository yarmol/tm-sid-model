/**
* Metric Definition Dimension ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.jO.e.p0CU.vE.eO.tV.b.kUFYE.u.d.g-content.html">Metric Definition Dimension ABE</a> 
* The Metric Definition Dimension ABE contains all entities describing t 
* he Dimension in a Metric context. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_abe.metric_definition_dimension_business_entity ;

/**
* A value that a MetricDimension can take on. 
 @since SID_R16.5
*/ 

public  class MetricDimensionValue  {



/**  
* Field metricDefAssignedDimValue
*/
protected List<MetricDefDimValueUse> metricDefAssignedDimValue ;




/**  
* Field dataType
* A kind of value represented by the value attribute, such as numeric, t 

* ext, and so forth. 

*/
protected String dataType ;




/**  
* Field value
* A discrete value that the MetricDefDimValue can take on. 

*/
protected String value ;




/**  
* Field metricDimension
*/
protected MetricDimension metricDimension ;


}