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
protected List<Usage> usage ;




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