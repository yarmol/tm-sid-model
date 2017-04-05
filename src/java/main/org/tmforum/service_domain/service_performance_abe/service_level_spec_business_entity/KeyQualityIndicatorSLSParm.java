/**
* Service Level Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EB1D7B80071-content.html">Service Level Spec ABE</a> 
* The Service Specification ABE contains entities that define the invari 
* ant characteristics and behavior of both types of Service entities. Th 
* is enables multiple instances to be derived from a single specificatio 
* n entity. In this derivation, each instance will use the invariant cha 
* racteristics and behavior defined in its associated template.This ABE  
* includes a third type of Service Specification entity: that of a Servi 
* ceLevelSpecification. This type of specification templatizes Services  
* that are bound to a Service Level Agreement. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_performance_abe.service_level_spec_business_entity ;

/**
* A measure of a specific aspect of the performance of a product (Produc 
* tSpecification, ProductOffering, or Product) or a service (ServiceSpec 
* ification or Service). A KQI draws its data from a number of sources,  
* including KPIs.This attribute is a placeholder.  There is no intent fo 
* r the SID model to represent the “internals” of an algorithm.  

Inheritance tree: |- 
 <a title="SID Models::Service Domain::Service Performance ABE::Service Level Spec ABE::ServiceLevelSpecParameter" href="_3E3F0EC000E93D4011450340-content.html">SID Models::Service Domain::Service Performance ABE::Service Level Spec ABE::ServiceLevelSpecParameter</a> @since SID_R16.5
*/ 

public  class KeyQualityIndicatorSLSParm extends ServiceLevelSpecParameter {



/**  
* Field KQITransformationAlgorithm
* A logical step-by-step procedure used to calculate the value of a KQI. 

*/
protected String KQITransformationAlgorithm ;


}