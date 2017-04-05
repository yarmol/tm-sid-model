/**
* Service Usage ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9421E1C8B01D7-content.html">Service Usage ABE</a> 
* The Service Usage ABE collects Service consumption data, and generates 
*  Service usage records, for use by other business entities. The entiti 
* es in this ABE provide physical, logical, and network usage informatio 
* n. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_usage_business_entity ;

/**
* An occurrence of employing a Service for its intended purpose. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage @since SID_R16.5
*/ 

public  class ServiceUsage extends Usage {



/**  
* Field service
*/
protected Service service ;




/**  
* Field resourceUsage
*/
protected List<ResourceUsage> resourceUsage ;




/**  
* Field productComponentUsage
*/
protected List<ProductComponentUsage> productComponentUsage ;




/**  
* Field productUsage
*/
protected List<ProductUsage> productUsage ;


}