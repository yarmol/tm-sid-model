/**
* Product Usage Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_IP.xN.oBSWE.d-6W67T.o.tM.y.y.w-content.html">Product Usage Spec ABE</a> 
* Specifies types of usage of ProductSpecifications. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_usage_abe.product_usage_spec_business_entity ;

/**
* A detailed description of the usage of a product, described by AtomicP 
* roductSpecification 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product Usage ABE::Product Usage Spec ABE::ProductUsageSpec" href="_3E3F0EC000E941C6C47E0331-content.html">SID Models::Product Domain::Product Usage ABE::Product Usage Spec ABE::ProductUsageSpec</a> |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage Spec ABE::UsageSpecification |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage Example Instances ABE::VoiceCallUsage2 : UsageSpecification @since SID_R16.5
*/ 

public  class AtomicProductUsageSpec extends ProductUsageSpec,UsageSpecification,VoiceCallUsage2 : UsageSpecification {



/**  
* Field resourceUsageSpec
*/
protected List<ResourceUsageSpec> resourceUsageSpec ;




/**  
* Field atomicProductSpecification
*/
protected AtomicProductSpecification atomicProductSpecification ;




/**  
* Field serviceUsageSpec
*/
protected List<ServiceUsageSpec> serviceUsageSpec ;


}