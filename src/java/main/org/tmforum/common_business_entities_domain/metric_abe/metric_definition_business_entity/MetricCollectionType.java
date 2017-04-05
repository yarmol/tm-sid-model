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
* The type of the collection such as: gauge, commulative, status inspect 
* ion. Indicators can be produced using these methods. 
 @since SID_R16.5
*/ 

public  enum MetricCollectionType  {



/**  
* Field CUMULATIVE
* Cumulative 

*/
 CUMULATIVE ,




/**  
* Field DELTA
* Delta 

*/
 DELTA ,




/**  
* Field DISCRETEEVENT
* DiscreteEvent 

*/
 DISCRETEEVENT ,




/**  
* Field GAUGE
* Gauge 

*/
 GAUGE ,




/**  
* Field STATUSINSPECTION
* StatusInspection 

*/
 STATUSINSPECTION ,


}