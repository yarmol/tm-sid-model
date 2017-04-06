/**
* Location ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CEC7B00DD-content.html">Location ABE</a> 
* The Location ABE represents the site or position of something, such as 
*  a customer’s address, the site of equipment where there is a fault an 
* d where is the nearest person who could repair the equipment, and so f 
* orth.  Locations can take the form of coordinates and/or addresses and 
* /or physical representations. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_business_entity ;

import com.sun.deploy.model.Resource;
import com.sun.deploy.services.Service;
import com.sun.prism.Texture;

import org.apache.tools.ant.Project;
import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;
import org.tmforum.common_business_entities_domain.business_interaction_business_entity.BusinessInteractionLocation;
import org.tmforum.common_business_entities_domain.calendar_business_entity.CalendarActionEntry;
import org.tmforum.common_business_entities_domain.project_abe.project_element_business_entity.ProjectElement;
import org.tmforum.common_business_entities_domain.project_abe.project_resource_business_entity.ProjectResource;
import org.tmforum.common_business_entities_domain.project_abe.project_resource_business_entity.ProjectResourceHolding;
import org.tmforum.common_business_entities_domain.project_abe.project_resource_business_entity.ProjectResourcePool;
import org.tmforum.customer_domain.customer_order_business_entity.CustomerOrderItem;
import org.tmforum.engaged_party_domain.party_business_entity.PartyRole;
import org.tmforum.engaged_party_domain.party_order_business_entity.PartyOrderItem;
import org.tmforum.enterprise_domain.workforce_abe.workforce_resource_business_entity.WorkforceOrganizationRole;
import org.tmforum.enterprise_domain.workforce_abe.workspecification_business_entity.WorkSpecFulfillmentRate;
import org.tmforum.product_domain.product_business_entity.Product;
import org.tmforum.product_domain.product_offering_business_entity.ProductOffering;
import org.tmforum.resource_domain.resource_abe.physicalresource_business_entity.PhysicalResource;

import java.util.List;

/**
* Place answers the question "where ?"It is an abstract modeling concept 
*  that provides a linking point to other parts of the SID model. 
 @since SID_R16.5
*/ 

public abstract class Place  {



/**  
* Field ID
* Unique identifier for Place. 

*/
protected String ID ;




/**  
* Field validFor
* The time period that the Place is valid for</br></br>Permitted Values: 

*   Refer Time Period class 

*/
protected TimePeriod validFor ;




/**  
* Field physicalResource
*/
protected List<PhysicalResource> physicalResource ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field projectElement
*/
protected List<ProjectElement> projectElement ;




/**  
* Field projectResourceHolding
*/
protected List<ProjectResourceHolding> projectResourceHolding ;




/**  
* Field projectResourcePool
*/
protected List<ProjectResourcePool> projectResourcePool ;




/**  
* Field projectResource
*/
protected List<ProjectResource> projectResource ;




/**  
* Field primeLocation
*/
protected List<Project> primeLocation ;




/**  
* Field calendarActionEntry
*/
protected CalendarActionEntry calendarActionEntry ;




/**  
* Field usage
*/
protected List<Texture.Usage> usage ;




/**  
* Field resource
*/
protected List<Resource> resource ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field product
*/
protected List<Product> product ;




/**  
* Field service
*/
protected List<Service> service ;




/**  
* Field workSpecFulfillmentRate
*/
protected List<WorkSpecFulfillmentRate> workSpecFulfillmentRate ;




/**  
* Field workforceOrganizationRole
*/
protected List<WorkforceOrganizationRole> workforceOrganizationRole ;




/**  
* Field partyOrderItem
*/
protected List<PartyOrderItem> partyOrderItem ;




/**  
* Field businessInteractionLocation
*/
protected List<BusinessInteractionLocation> businessInteractionLocation ;




/**  
* Field customerOrderItem
*/
protected List<CustomerOrderItem> customerOrderItem ;


}