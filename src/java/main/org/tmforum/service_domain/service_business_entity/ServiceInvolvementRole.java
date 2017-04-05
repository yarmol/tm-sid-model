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

/**
* A role a business entity (such as PartyRole, ResourceRole or CustomerA 
* ccount) plays in the relationship for a Service. For example: user, ow 
* ner, and so forth. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Users and Roles ABE::InvolvementRole @since SID_R16.5
*/ 

public  class ServiceInvolvementRole extends InvolvementRole {



/**  
* Field service
*/
protected List<Service> service ;


}