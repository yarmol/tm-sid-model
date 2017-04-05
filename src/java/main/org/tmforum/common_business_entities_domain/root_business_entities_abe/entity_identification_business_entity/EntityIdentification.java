/**
* Entity Identification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93F4ACF61022E-content.html">Entity Identification ABE</a> 
* A collection of entities that can be used to dynamicall specify variou 
* s identification formats for any type of entity and to represent ident 
* ification instances associated with entities. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_abe.entity_identification_business_entity ;

/**
* Essential characteristics that uniquely identifies somebody or somethi 
* ng. 
 @since SID_R16.5
*/ 

public abstract class EntityIdentification  {



/**  
* Field value
* A value used to identify an instance of an entity. 

*/
protected String value ;




/**  
* Field entityIdentificationSpecification
*/
protected EntityIdentificationSpecification entityIdentificationSpecification ;




/**  
* Field compositeEntityIdentification
*/
protected CompositeEntityIdentification compositeEntityIdentification ;




/**  
* Field entity
*/
protected Entity entity ;




/**  
* Field securityEntity
*/
protected SecurityEntity securityEntity ;




/**  
* Field securityVulnerability
*/
protected SecurityVulnerability securityVulnerability ;




/**  
* Field securityIncident
*/
protected SecurityIncident securityIncident ;




/**  
* Field securityThreat
*/
protected List<SecurityThreat> securityThreat ;




/**  
* Field securityThreatActor
*/
protected List<SecurityThreatActor> securityThreatActor ;




/**  
* Field securityVulnerability2
*/
protected List<SecurityThreatExploit> securityVulnerability2 ;




/**  
* Field metricDefinition
*/
protected List<MetricDefinition> metricDefinition ;


}