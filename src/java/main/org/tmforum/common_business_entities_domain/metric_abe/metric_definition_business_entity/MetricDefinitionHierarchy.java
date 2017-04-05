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
* The definition of a hierarchy  of MetricDefinitions, such as a calcula 
* tion hierarchy of MetricDefinitions. 
 @since SID_R16.5
*/ 

public  class MetricDefinitionHierarchy  {



/**  
* Field metricDefinitionHierarchyMember
*/
protected List<MetricDefinitionHierarchyMember> metricDefinitionHierarchyMember ;




/**  
* Field name
* A word, term, or phrase by which the MetricDefinitionHierarchy is know 

* n and distinguished from other MetricDefinitionHierarchies. 

*/
protected String name ;


}