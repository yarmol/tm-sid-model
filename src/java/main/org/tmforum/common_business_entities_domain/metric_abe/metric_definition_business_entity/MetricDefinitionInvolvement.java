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
* Captures how MetricDefinition is involved with other entites in the In 
* formation Framework (such as Party and PartyRole) 
 @since SID_R16.5
*/ 

public  class MetricDefinitionInvolvement  {



/**  
* Field party
*/
protected Party party ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field metricDefinition
*/
protected MetricDefinition metricDefinition ;




/**  
* Field involvementType
* Involvement type may inlude roles such as user, source owner and defin 

* ing authority 

*/
protected String involvementType ;




/**  
* Field validFor
* The period for which the involvement is applicable. 

*/
protected DateTime validFor ;


}