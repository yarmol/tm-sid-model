/**
* Product Usage Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_IP.xN.oBSWE.d-6W67T.o.tM.y.y.w-content.html">Product Usage Spec ABE</a> 
* Specifies types of usage of ProductSpecifications. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_usage_abe.product_usage_spec_business_entity ;

/**
* A detailed description of a product usage event. It represents custome 
* r's transaction as a whole or its autonomously billable part. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage Spec ABE::UsageSpecification |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage Example Instances ABE::VoiceCallUsage2 : UsageSpecification @since SID_R16.5
*/ 

public abstract class ProductUsageSpec extends UsageSpecification,VoiceCallUsage2 : UsageSpecification {



/**  
* Field productSpecification
*/
protected ProductSpecification productSpecification ;




/**  
* Field compositeProductUsageSpec
*/
protected List<CompositeProductUsageSpec> compositeProductUsageSpec ;




/**  
* Field productUsage
*/
protected List<ProductUsage> productUsage ;


}