/**
* Root Business Entities ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93CF68FE80295-content.html">Root Business Entities ABE</a> 
* A set of common business entities that collectively serve as the found 
* ation of the business view. This set of entities enables the entities  
* in different domains of the SID Framework to be associated with each o 
* ther, providing greater overall coherence to the information framework 
* . 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_business_entity ;

/**
* A SID entity, such as Customer, Product, Service, and so forth. 
 @since SID_R16.5
*/ 

public  class RootEntityType  {



/**  
* Field entityIdentificationSpecification
*/
protected List<EntityIdentificationSpecification> entityIdentificationSpecification ;




/**  
* Field rootEntity
*/
protected List<RootEntity> rootEntity ;




/**  
* Field revenueAssuranceParameter
*/
protected List<RevenueAssuranceParameter> revenueAssuranceParameter ;




/**  
* Field rootEntityTypeCharUse
*/
protected List<RootEntityTypeCharUse> rootEntityTypeCharUse ;




/**  
* Field name
* A word, term, or phrase by which the RootEntityType is known and disti 

* nguished from other RootEntityTypes. 

*/
protected String name ;




/**  
* Field metricDefinition
*/
protected List<MetricDefinition> metricDefinition ;




/**  
* Field monitoredMetricClassCriteria
*/
protected List<MonitoredMetricClassCriterion> monitoredMetricClassCriteria ;


}