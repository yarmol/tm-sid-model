/**
* Service Performance Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E944BD3C47037A-content.html">Service Performance Specification ABE</a> 
* The Service Performance ABE defines measure of the manner in which a S 
* ervice is functioning. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_performance_abe.service_performance_specification_business_entity ;

/**
* The characteristics of a measure of the manner in which a Service is f 
* unctioning. Each related Performance instance will have the same chara 
* cteristics. However, the values associated with other characteristics  
* of the instantiated Performance entity are specific to each instance. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Performance ABE::Performance Specification ABE::PerformanceSpecification @since SID_R16.5
*/ 

public  class ServicePerformanceSpec extends PerformanceSpecification {



/**  
* Field serviceSpecification
*/
protected ServiceSpecification serviceSpecification ;


}