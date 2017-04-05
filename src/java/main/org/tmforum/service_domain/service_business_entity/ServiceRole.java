/**
* Service ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D5091860236-content.html">Service ABE</a> 
* The Service ABE contains entities that are used to represent both cust 
* omer-facing and resource-facing types of services. Entities in this AB 
* E provide different views to examine, analyze, configure, monitor and  
* repair Services of all types. Entities in this ABE are derived from Se 
* rvice Specification entities. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_business_entity ;

import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.Role;
import org.tmforum.service_domain.service_specification_business_entity.ServiceSpecificationRole;

import java.util.List;


/**
* This is an abstract base class that defines a Service in terms of a se 
* t of roles. The roles are then used to characterize the functionality  
* of the Service, regardless of whether it is a resource- or a customer- 
* facing service.ServiceRoles represent the functionality of a Service,  
* and as such are a mix of the invariant and changeable characteristics  
* of a Service. Representing a Service in terms of ServiceRoles enables  
* the functionality of the Service to be defined independently of Busine 
* ssActor, PhysicalResource, LogicalResource, or other Services. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ServiceRole extends Role {



/**  
* Field service
*/
protected Service service ;




/**  
* Field serviceRole
*/
protected List<ServiceRole> serviceRole ;




/**  
* Field serviceRole1
*/
protected List<ServiceRole> serviceRole1 ;




/**  
* Field serviceSpecificationRole
*/
protected ServiceSpecificationRole serviceSpecificationRole ;


}