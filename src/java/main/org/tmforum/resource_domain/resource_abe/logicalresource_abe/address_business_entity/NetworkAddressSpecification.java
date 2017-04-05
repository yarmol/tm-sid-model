/**
* Address ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C98D60102-content.html">Address ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.address_business_entity ;

/**
* The invariant characteristics that define a NetworkAddress. NetworkAdd 
* ressSpecifications define different types of addresses of different te 
* chnologies, such as an IPAddress vs. an IPXAddress. Each related Netwo 
* rkAddress instance will have the same invariant characteristics. Howev 
* er, the values associated with other characteristics of the instantiat 
* ed NetworkAddress entity are specific to each instance. 
 @since SID_R16.5
*/ 

public  class NetworkAddressSpecification  {



/**  
* Field resourceSpecification
*/
protected List<ResourceSpecification> resourceSpecification ;




/**  
* Field ID
* A unique identifier for the NetworkAddressSpecification. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which a NetworkAddressSpecification is know 

* n and distinguished from other NetworkAddressSpecifications. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the NetworkAddressSpecificati 

* on is. 

*/
protected String description ;




/**  
* Field validFor
* The period for which a NetworkAddressSpecification applies. 

*/
protected TimePeriod validFor ;




/**  
* Field resourcespecification
*/
protected List<ResourceSpecification> resourcespecification ;


}