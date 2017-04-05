/**
* Protocol Service ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C35EF01D4-content.html">Protocol Service ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protocol_service_business_entity ;

/**
* A Protocol is a formal set of rules and conventions that governs how t 
* wo entities exchange information (usually over one or more types of ne 
* twork media).This is an abstract base class for representing Protocols 
*  that can be managed. This class represents a convenient aggregation p 
* oint for defining how Protocols are managed and used. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class Protocol extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field currentPortNumber
* This is a non-negative integer that defines the port number used by th 

* is protocol. 

*/
protected Integer currentPortNumber ;




/**  
* Field isEphemeral
* This is a Boolean attribute. If its value is TRUE, then this protocol  

* can use ephemeral port numbers. If its value is FALSE, then this proto 

* col will only use well-defined port numbers. 

*/
protected Boolean isEphemeral ;




/**  
* Field protocolDirection
* This is an enumerated integer that defines the direction of this proto 

* col. Values are:</br></br> 0: input</br> 1: output</br> 2: bi-directio 

* nal</br> 

*/
protected Integer protocolDirection ;




/**  
* Field portRangeStart
* This non-negative integer defines the lower range of allowable port nu 

* mbers to use. 

*/
protected Integer portRangeStart ;




/**  
* Field portRangeEnd
* This non-negative integer defines the upper range of allowable port nu 

* mbers to use. 

*/
protected Integer portRangeEnd ;




/**  
* Field deviceInterface
*/
protected List<DeviceInterface> deviceInterface ;




/**  
* Field logicalDevice
*/
protected List<LogicalDevice> logicalDevice ;




/**  
* Field device
*/
protected Device device ;




/**  
* Field resourceFacingService2
*/
protected ResourceFacingService resourceFacingService2 ;


}