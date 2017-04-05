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

import org.tmforum.common_business_entities_domain.catalog_abe.entity_catalog_business_entity.EntityCatalogItem;
import org.tmforum.common_business_entities_domain.metric_abe.metric_measure_business_entity.MetricMeasure;
import org.tmforum.common_business_entities_domain.metric_abe.metric_monitoring_business_entity.MonitoredMetricInstanceCriterion;
import org.tmforum.common_business_entities_domain.root_business_entities_abe.characteristic_business_entity.CharacteristicValue;
import org.tmforum.common_business_entities_domain.topology_business_entity.DirectedEdge;
import org.tmforum.common_business_entities_domain.topology_business_entity.Vertex;
import org.tmforum.enterprise_domain.enterprise_risk_abe.revenue_assurance_abe.ra_control_business_entity.RevenueAssuranceParmValue;

import java.util.List;

/**
* This is the top of the SID class hierarchy. The purpose of the RootEnt 
* ity is to define a set of attributes that are common to all SID entiti 
* es that derive from it. These properties enable us to name, describe,  
* and identify all objects (manageable and unmanageable) in the environm 
* ent. 
 @since SID_R16.5
*/ 

public abstract class RootEntity  {



/**  
* Field rootEntityType
*/
protected RootEntityType rootEntityType ;




/**  
* Field revenueAssuranceParmValue
*/
protected List<RevenueAssuranceParmValue> revenueAssuranceParmValue ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field name
* Represents a user-friendly identifier of an object. It is a (possibly  

* ambiguous) name by which the object is commonly known in some limited  

* scope (such as an organization) and conforms to the naming conventions 

*  of the country or culture with which it is associated. It is NOT used 

*  as a naming attribute (i.e., to uniquely identify an instance of the  

* object). 

*/
protected String name ;




/**  
* Field description
* This is a string, and defines a textual free-form description of the o 

* bject.</br></br>Notes:</br>This attribute doesn’t exist in M.3100. The 

*  CIM has two attributes for this purpose, Caption (a short description 

* ) and Description. 

*/
protected String description ;




/**  
* Field ID
* Unambiguously distinguishes different object instances. It is the nami 

* ng attribute of the object. 

*/
protected String ID ;




/**  
* Field metric
*/
protected List<MetricMeasure> metric ;




/**  
* Field monitoredMetricInstancesCriteria
*/
protected List<MonitoredMetricInstanceCriterion> monitoredMetricInstancesCriteria ;




/**  
* Field directedEdge
*/
protected List<DirectedEdge> directedEdge ;




/**  
* Field vertex
*/
protected List<Vertex> vertex ;




/**  
* Field entityCatalogItem
*/
protected List<EntityCatalogItem> entityCatalogItem ;


}