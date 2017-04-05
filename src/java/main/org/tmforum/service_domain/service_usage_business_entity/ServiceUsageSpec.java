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
* A detailed description of a service usage event (for example, a purcha 
* se or a usage of a service). 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage Spec ABE::UsageSpecification |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage Example Instances ABE::VoiceCallUsage2 : UsageSpecification @since SID_R16.5
*/ 

public  class ServiceUsageSpec extends UsageSpecification,VoiceCallUsage2 : UsageSpecification {



/**  
* Field serviceSpecification
*/
protected ServiceSpecification serviceSpecification ;




/**  
* Field resourceUsageSpec
*/
protected List<ResourceUsageSpec> resourceUsageSpec ;




/**  
* Field atomicProductUsageSpec
*/
protected List<AtomicProductUsageSpec> atomicProductUsageSpec ;


}