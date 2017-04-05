/**
* Management Method ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E301F920130-content.html">Management Method ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.management_information_abe.management_method_business_entity ;

/**
* This is an abstract base class for representing the different types of 
*  management methods that can be used to gather a particular type of ma 
* nagement information. For example, this enables configuration setting  
* classes to be defined as using CLI, while configuration monitoring cla 
* sses could be defined as using a different method, such as SNMP.The de 
* sign of how management information is obtained uses this class to gath 
* er specific type of information, and the ManagementMethodEntity class  
* to obtain the desired data using an appropriate method. This combinati 
* on of class hierarchies enables different management methods (e.g., CL 
* I vs. SNMP) to be used to gather different types of management data, a 
* nd is unique to the SID information model. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ManagementMethodEntity extends Entity {



/**  
* Field managedEntity
*/
protected ManagedEntity managedEntity ;




/**  
* Field describedMgmtInfoDetails
*/
protected DescribedMgmtInfoDetails describedMgmtInfoDetails ;


}