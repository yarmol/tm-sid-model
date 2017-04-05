/**
* Service Test ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_5.m7G.wFZBE.eSV1895.iQDMDA-content.html">Service Test ABE</a> 
* A service test is a function performed on a service  that results in m 
* easures being produced that reflect the functioning of the entity unde 
* r test. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_test_business_entity ;

/**
*  An entity that exists for a controlled test invocation on a service.  
* The service test is executed according to a schedule. and contains ser 
* vice test configuration parameters that are to be applied at execution 
*  time, and service test measures that result.  

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Test ABE::Test @since SID_R16.5
*/ 

public  class ServiceTest extends Test {



/**  
* Field service
*/
protected Service service ;


}