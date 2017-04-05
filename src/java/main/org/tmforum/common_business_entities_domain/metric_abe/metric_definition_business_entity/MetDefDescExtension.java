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
* Text that represents extensions to the MetricDefinition description at 
* tribute, such as comments. 
 @since SID_R16.5
*/ 

public  class MetDefDescExtension  {



/**  
* Field metDefType
* Type of description extension, such as comments, MetricDefinition owne 

* r notes, references, and so forth. 

*/
protected String metDefType ;




/**  
* Field descriptionExtension
* Text that represents the extension to the description of MetricDefinit 

* ion. 

*/
protected String descriptionExtension ;




/**  
* Field metricDefinition
*/
protected MetricDefinition metricDefinition ;


}