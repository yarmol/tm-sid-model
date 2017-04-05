/**
* Service Configuration ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_D03.xULEWE.eO.zH-.sW.b.tWA.yQ-content.html">Service Configuration ABE</a> 
* The definition of how a Service operates or functions in terms of Char 
* acteristicSpecification(s) and related ResourceSpec(s) and ServiceSpec 
* (s) as well as a representation of how a Product operates or functions 
*  in terms of characteristics and related Resource(s) and Service(s). 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_configuration_business_entity ;

/**
* The definition of how a Service operates or functions in terms of Char 
* acteristicSpecification(s) and related ResourceSpec(s) and ServiceSpec 
* (s). 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Configuration and Profiling ABE::ConfigurationSpecification @since SID_R16.5
*/ 

public  class ServiceConfigSpec extends ConfigurationSpecification {



/**  
* Field serviceConfiguration
*/
protected List<ServiceConfiguration> serviceConfiguration ;




/**  
* Field serviceSpecification2
*/
protected ServiceSpecification serviceSpecification2 ;




/**  
* Field service
*/
protected Service service ;


}