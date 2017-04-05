/**
* Resource Usage ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9421E1C8001B3-content.html">Resource Usage ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_usage_business_entity ;

/**
* A detailed description of a resource usage event (for example, a purch 
* ase or a lease of a resource). 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage Spec ABE::UsageSpecification |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage Example Instances ABE::VoiceCallUsage2 : UsageSpecification @since SID_R16.5
*/ 

public  class ResourceUsageSpec extends UsageSpecification,VoiceCallUsage2 : UsageSpecification {



/**  
* Field resourceSpecification
*/
protected ResourceSpecification resourceSpecification ;




/**  
* Field atomicProductUsageSpec
*/
protected List<AtomicProductUsageSpec> atomicProductUsageSpec ;




/**  
* Field serviceUsageSpec
*/
protected List<ServiceUsageSpec> serviceUsageSpec ;


}