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
* A group or set of MetricDefinition qualities that are classified toget 
* her because of common characteristics.  For example, a business metric 
*  or performance metric.  Categories can be further divided into sub-ca 
* tegories. 
 @since SID_R16.5
*/ 

public  class MetricDefinitionCategory  {



/**  
* Field metricDefinition
*/
protected List<MetricDefinition> metricDefinition ;




/**  
* Field name
* A word, term, or phrase by which the MetricDefinitionCategory is known 

*  and distinguished from other MetricDefinitionCategories. Examples inc 

* lude x domain or business architecture domain. 

*/
protected String name ;




/**  
* Field metricDefinitionCategory
*/
protected MetricDefinitionCategory metricDefinitionCategory ;




/**  
* Field metricDefinitionCategory2
*/
protected List<MetricDefinitionCategory> metricDefinitionCategory2 ;




/**  
* Field description
* A narrative that explains what a  MetricDefinitionCategory is. 

*/
protected String description ;




/**  
* Field linkageReference
* A reference to other forms of categorization such as Frameworx domains 

*  or Business Architecture domains. 

*/
protected String linkageReference ;


}