/**
* Resource Usage ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9421E1C8001B3-content.html">Resource Usage ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_usage_business_entity ;

/**
* An occurrence of employing a Resource for its intended purpose. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage @since SID_R16.5
*/ 

public  class ResourceUsage extends Usage {



/**  
* Field resource
*/
protected Resource resource ;




/**  
* Field productComponentUsage
*/
protected List<ProductComponentUsage> productComponentUsage ;




/**  
* Field serviceusage
*/
protected List<ServiceUsage> serviceusage ;


}