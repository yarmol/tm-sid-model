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
* The relationship between two MetricDefinitions in a hierarchy. 
 @since SID_R16.5
*/ 

public  class MetricDefinitionHierarchyMember  {



/**  
* Field metricDefinition
*/
protected List<MetricDefinition> metricDefinition ;




/**  
* Field metricDefinitionHierarchy
*/
protected MetricDefinitionHierarchy metricDefinitionHierarchy ;




/**  
* Field metricDefinition2
*/
protected MetricDefinition metricDefinition2 ;


}