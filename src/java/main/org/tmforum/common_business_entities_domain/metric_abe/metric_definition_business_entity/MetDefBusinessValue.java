/**
* Metric Definition ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_P2QVYN.z4E.eK.x.q4T-.pM.g.h.eQ-content.html">Metric Definition ABE</a> 
* The Metric Definition ABE contains the main entities describing a Metr 
* icDefinition such as MetricDefinition itself, MetricDefinitionCategory 
*  and MetricDefinitionDimension. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_business_entity ;

/**
* The relative value of the MetricDefinition to the business. 
 @since SID_R16.5
*/ 

public  class MetDefBusinessValue  {



/**  
* Field metricDefinition
*/
protected MetricDefinition metricDefinition ;




/**  
* Field businessDriverValue
* A textual description of business drivers, such as revenue benefit, co 

* st benefit, efficiency, customer experience, time to market, and so fo 

* rth. 

*/
protected String businessDriverValue ;




/**  
* Field businessDriverImpact
* A textual description of the impact to the business if the metric lags 

* . 

*/
protected String businessDriverImpact ;




/**  
* Field businessDriverPriority
* A textual description of how important this metric is to the business. 

*/
protected String businessDriverPriority ;


}